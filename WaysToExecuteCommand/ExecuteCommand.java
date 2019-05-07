import java.io.IOException;

public class ExecuteCommand {
    public static void main(String args[]){
        //method 1
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("open", "/Applications/Calculator.app");
        try{
            Process process1 = processBuilder.start();
        }catch (IOException e){
            e.printStackTrace();
        }

        //method 2
        try{
            Process process2 = Runtime.getRuntime().exec("open /Applications/Siri.app");

        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}
