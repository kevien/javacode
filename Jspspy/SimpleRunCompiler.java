import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class SimpleRunCompiler {

    public void compile(String filename) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        int status = compiler.run(null, null, null, filename);
        if (status == 0) {
            System.out.println("Compile success!");
        } else {
            System.out.println("Compile failed!");
        }
    }

}