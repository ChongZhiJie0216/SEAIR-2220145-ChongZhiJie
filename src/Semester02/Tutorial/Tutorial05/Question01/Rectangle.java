package Semester02.Tutorial.Tutorial05.Question01;

public class Rectangle {
    private double length;
    private double width;

    Rectangle(){
        length =1.0;
        width =1.0;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
       return length*width;
    }
}
