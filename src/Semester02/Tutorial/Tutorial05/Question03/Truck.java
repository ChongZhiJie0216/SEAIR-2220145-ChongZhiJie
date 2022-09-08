package Semester02.Tutorial.Tutorial05.Question03;

public class Truck extends Car {
    private int weight;

    Truck(int speed, double regularPrice, String color, int weight){
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    public double getSalesPrice(){
        if(weight>2000){
            return super.getSalesPrice()-0.1 * super.getSalesPrice();
        }
        else{
            return super.getSalesPrice()-0.2 * super.getSalesPrice();
        }
    }
}
