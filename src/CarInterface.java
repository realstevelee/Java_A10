import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CarInterface extends Remote {
    String register(Car c) throws RemoteException;
}
