import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IHelloImpl extends UnicastRemoteObject implements IHello {
    protected IHelloImpl() throws RemoteException {
        super();
    }
    public String sayHello(String name) throws RemoteException {
        return "Hello " + name + " ^_^ ";
    }
}