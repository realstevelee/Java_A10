import java.rmi.*;
import java.rmi.server.*;

public class CarImpl extends UnicastRemoteObject implements CarInterface {
    public CarImpl() throws RemoteException {
        super();
    }

    public String register(Car c) throws RemoteException {
        return "ONT" + c.hashCode();
    }
}