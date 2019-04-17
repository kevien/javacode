import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.util.Arrays;

public class MemoryTaskCompiler {

    public void compile(String className) {
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
    }
}