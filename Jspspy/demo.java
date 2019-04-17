import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.ToolProvider;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class demo {
    public static void readToBuffer(StringBuffer buffer, String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        String line; // 用来保存每行读取的内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine(); // 读取第一行
        while (line != null) { // 如果 line 为空说明读完了
            buffer.append(line); // 将读到的内容添加到 buffer 中
            buffer.append("\n"); // 添加换行符
            line = reader.readLine(); // 读取下一行
        }
        reader.close();
        is.close();
    }

    public static void main(String[]args) throws Exception{
//        SimpleRunCompiler compiler = new SimpleRunCompiler();
//        compiler.compile("CompileMe.java");

//        FileTaskCompiler compiler = new FileTaskCompiler();
//        compiler.compile("CompileMe.java");

//        MemoryOutputTaskCompiler compiler = new MemoryOutputTaskCompiler();
//        compiler.compile("test");
        String className = "HelloServlet";

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        // 使用自定义的 FileManager 来重定向输出
        MemoryClassFileManager fileManager = new MemoryClassFileManager(compiler.getStandardFileManager(null,
                null, null));

        StringJavaFileObject sourceObject = new StringJavaFileObject(className);
        StringBuffer Buffer = new StringBuffer();
        demo.readToBuffer(Buffer, "/Users/m0rk/sources/java/jspspy/src/HelloServlet.java");
//        sourceObject.setCode(
//                "public class " + className + " {" +
//                        "    public static void main(String[] args) {" +
//                        "        System.out.println(\"Compiled on the fly :)\");" +
//                        "    }" +
//                        "}");
        System.out.println(Buffer.toString());
        sourceObject.setCode(Buffer.toString());
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null,
                null, null, Arrays.asList(sourceObject));
        if (task.call()) {
            System.out.println("Compile success!");
        } else {
            System.out.println("Compile failed!");
        }

        MemoryClassLoader loader = new MemoryClassLoader(fileManager);


        Class clazz = null;

        try{
              clazz = loader.loadClass(className);
              System.out.println("Load success!");
//            Method entryMethod = clazz.getMethod("main", new Class[] { String[].class });
//            Object instance = clazz.newInstance();
//            String[] params = {null};
//            entryMethod.invoke(instance,params);


        }catch (ClassNotFoundException e){
            e.printStackTrace();
//        }catch (NoSuchMethodException e){
//            e.printStackTrace();
//        }catch (IllegalAccessException e){
//            e.printStackTrace();
//        }catch (InstantiationException e){
//            e.printStackTrace();
//        }catch (InvocationTargetException e){
//            e.printStackTrace();
        }


    }
}
