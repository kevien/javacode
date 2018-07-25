import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test{
    public static void runInMemory(MemoryClassFileManager fileManager, String className) {
        Class clazz = null;
        // 使用自定义的 ClassLoader 来加在类对象
        MemoryClassLoader loader = new MemoryClassLoader(fileManager);
        try {
            clazz = loader.loadClass(className);

            Method entryMethod = clazz.getMethod("main", new Class[] { String[].class });
            Object instance = clazz.newInstance();

            String[] params = { null };
            entryMethod.invoke(instance, params);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static void main(String []args) {


        //first compile the code in memory
        String className = "bbb";
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        // 使用自定义的 FileManager 来重定向输出
        MemoryClassFileManager fileManager = new MemoryClassFileManager(compiler.getStandardFileManager(null,
                null, null));

        StringJavaFileObject sourceObject = new StringJavaFileObject(className);
        sourceObject.setCode(
                "public class " + className + " {" +
                        "    public static void main(String[] args) {" +
                        "        System.out.println(\"Compiled on the fly :)\");" +
                        "    }" +
                        "}");

        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null,
                null, null, Arrays.asList(sourceObject));
        if (task.call()) {
            System.out.println("Compile success!");
        } else {
            System.out.println("Compile failed!");
        }

        //secode load the class and call the main function
        runInMemory(fileManager,"bbb");




    }
}