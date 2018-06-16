package FastJsonDemo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import sun.misc.BASE64Encoder;

public class ReadFileToByte {
    public static void main(String [] args) throws Exception{
        //there must be compiled java class file ,not the java source code ,or will "Incompatible magic value 1768779887 in class file" Error
        Path path = Paths.get("/Users/m0rk/Desktop/tmp/untitled/src/FastJsonDemo.R.class");
        byte[] data = Files.readAllBytes(path);
        BASE64Encoder encoder = new BASE64Encoder();
        String encoded = encoder.encode(data);
        System.out.print(encoded);

    }
}
