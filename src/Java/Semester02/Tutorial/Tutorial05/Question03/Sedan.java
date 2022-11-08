package Semester02.Tutorial.Tutorial05.Question03;

public class Sedan extends Car{
    private final int length;

    Sedan(int speed, double regularPrice, String color,int length){
        super(speed, regularPrice, color);
        this.length = length;
    }
    @Override
    public double getSalesPrice() {
        if(length >20){
            return super.getSalesPrice() - (0.05 * super.getSalesPrice());
        }
        else{
            return super.getSalesPrice() - (0.1 * super.getSalesPrice());
        }
    }
}
