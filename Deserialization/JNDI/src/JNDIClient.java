import javax.naming.Context;
import javax.naming.InitialContext;

public class JNDIClient {
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            System.out.println("Usage: java JNDIClient <uri>");
            System.exit(-1);
        }
        String uri = args[0];
        Context ctx = new InitialContext();
        System.out.println("Using lookup() to fetch object with " + uri);
        ctx.lookup(uri);
    }
}