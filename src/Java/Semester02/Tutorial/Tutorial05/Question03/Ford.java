package Semester02.Tutorial.Tutorial05.Question03;

public class Ford extends Car{
    private final int year;
    private final int manufacturerDiscount;

    Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount){
        super(speed,regularPrice,color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public double getSalesPrice() {
        return (super.getSalesPrice() - manufacturerDiscount);
    }
}
