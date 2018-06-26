import java.util.Properties;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import javax.naming.Context;
import javax.naming.InitialContext;

public class CallService {
    public static void main(String args[]) throws Exception {
        // 配置 JNDI 默认设置
        Properties env = new Properties();
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put(Context.PROVIDER_URL,
                "rmi://localhost:1099");
        Context ctx = new InitialContext(env);

        // 本地开启 1099 端口作为 RMI 服务，并以标识 "hello" 绑定方法对象
        Registry registry = LocateRegistry.createRegistry(1099);
        IHello hello = new IHelloImpl();
        registry.bind("hello", hello);

        // JNDI 获取 RMI 上的方法对象并进行调用
        IHello rHello = (IHello) ctx.lookup("hello");
        System.out.println(rHello.sayHello("M0rk"));
    }
}