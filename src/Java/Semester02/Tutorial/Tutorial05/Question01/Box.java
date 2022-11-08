package Semester02.Tutorial.Tutorial05.Question01;

public class Box extends Rectangle{
    private final double height;

    Box(){
        super();
        height = 1.0;
    }
    Box(double length, double width, double height){
        super(length, width);
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
}