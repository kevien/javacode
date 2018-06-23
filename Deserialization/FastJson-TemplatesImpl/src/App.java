import com.alibaba.fastjson.JSON;

import java.io.*;

public class App
{
    public static void readToBuffer(StringBuffer buffer, String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        String line; // 用来保存每行读取的内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine(); // 读取第一行
        while (line != null) { // 如果 line 为空说明读完了
            buffer.append(line); // 将读到的内容添加到 buffer 中
            buffer.append("\n"); // 添加换行符
            line = reader.readLine(); // 读取下一行
        }
        reader.close();
        is.close();
    }
    public static void main( String[] args ) throws IOException
    {
        StringBuffer Buffer = new StringBuffer();
        App.readToBuffer(Buffer,"/Users/m0rk/vul/fastjson/src/demo.json");
        Object obj = JSON.parseObject(Buffer.toString());
    }
}