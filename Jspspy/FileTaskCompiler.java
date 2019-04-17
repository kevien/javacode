import javax.tools.*;
import java.util.Arrays;

public class FileTaskCompiler {

    public void compile(String filename) {

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        DiagnosticCollector<JavaFileObject> diagnosticCollector = new DiagnosticCollector<JavaFileObject>();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnosticCollector, null, null);

        Iterable javaFileObjects = fileManager.getJavaFileObjects(filename);

        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnosticCollector, Arrays.asList("-d", "/tmp"),null, javaFileObjects);
        if (task.call()) {
            System.out.println("Compile success!");
        } else {
            System.out.println("Compile failed!");

            // Display the error informations
            for (Diagnostic diagnostic:
                    diagnosticCollector.getDiagnostics()) {
                System.out.println(diagnostic.getMessage(null));
                System.out.println(diagnostic.getCode());
            }
        }
    }

}