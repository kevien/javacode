import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Hashtable;

public class JNDIVulClient {
    public static void main(String[] args) throws Exception {
//        if(args.length < 1) {
//            System.out.println("Usage: java JNDIVULClient <uri>");
//            //example JNDIVulClient  rmi://192.168.199.182:1099/refObj
//            System.exit(-1);
//        }
        //高版本的JDK需要设置此属性。
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put(Context.PROVIDER_URL, "rmi://secure-server:1099");

        //String uri = args[0];
        //assume the uri is attacker controlled!
        String uri = "rmi://192.168.199.182:1099/refObj";
        Context ctx = new InitialContext(env);
        //note !!! uri is attacker controlled ,and overwrite the default rmi://secure-server:1099
        System.out.println("Using lookup() to fetch object with " + uri);
        ctx.lookup(uri);
    }
}