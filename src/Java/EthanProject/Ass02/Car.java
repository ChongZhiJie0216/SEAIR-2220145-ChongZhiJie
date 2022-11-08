package EthanProject.Ass02;

public class Car extends Vehicle{

    private String transmission;

    public Car(String model, String color, String transmission) {
        super(model, color, 4);
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

}
