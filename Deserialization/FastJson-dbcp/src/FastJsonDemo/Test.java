package FastJsonDemo;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Test {
    public static void main(String []args) throws Exception {

        URLClassLoader cls = new URLClassLoader(new URL[]{new URL("file:/Users/m0rk/Desktop/tmp/untitled/src/FastJsonDemo.R.java")});
        Class cl = cls.loadClass("FastJsonDemo.R");
        Method m = cl.getMethod("exec",String.class);
        m.invoke(cl.newInstance(),"id");

    }
}
