import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CarServer {
    public static void main(String args[]) {
        try {
            CarInterface stub = new CarImpl();
            LocateRegistry.createRegistry(5000);
            Naming.rebind("rmi://localhost:5000/Server", stub);
            System.out.println("Server is started.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
