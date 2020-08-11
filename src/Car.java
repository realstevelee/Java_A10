import java.io.Serializable;

public class Car implements Serializable {
    private String model;
    private String color;
    private int mileage;
    private String registered;

    public Car(String models, String colors, int mileages) {
        this.model = models;
        this.color = colors;
        this.mileage = mileages;
        registered = "Unregistered";
    }

    public void setPlate(String plate) {
        registered = plate;
    }

    public String toString() {
        return "Model: " + model + " Color: " + color + " Plate: " + registered + " Mileage: " + mileage + "\n";
    }

}
