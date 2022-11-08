package EthanProject.Ass02;

public class Vehicle {

    private String model;
    private String color;
    private int wheel;

    public Vehicle(String model, String color, int wheel) {
        this.model = model;
        this.color = color;
        this.wheel = wheel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
