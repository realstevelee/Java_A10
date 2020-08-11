import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CarClient {
    public static void main(String[] args) throws RemoteException {
        try {
            CarInterface car = (CarInterface) Naming.lookup("rmi://localhost:5000/Server");
            System.out.println("Client is started");

            Car[] cars = new Car[3];
            cars[0] = new Car("Hyundai Elantra", "Blue",5000);
            cars[1] = new Car("Toyota Corolla", "Red", 7500);
            cars[2] = new Car("Honda Civic", "Black", 12000);

            for(int i = 0 ; i < 3 ; i ++ ){
                System.out.println("Car detail before registration: " + cars[i]);
                cars[i].setPlate(car.register(cars[i]));
                System.out.println("Car detail after registration: " + cars[i]);
                System.out.println("=================================\n");
            }
        } catch (NotBoundException e) {
            System.out.println(e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}
