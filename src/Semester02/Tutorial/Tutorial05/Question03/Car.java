package Semester02.Tutorial.Tutorial05.Question03;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public double getSalesPrice() {
        return regularPrice;
    }

    Car(int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }


}
