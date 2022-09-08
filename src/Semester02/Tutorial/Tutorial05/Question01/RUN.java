package Semester02.Tutorial.Tutorial05.Question01;

public class RUN {
    public static void main(String[] args) {
        Box box = new Box();

        System.out.println("Area of Box 1:"+box.getArea());
        System.out.println("Volume of Box 1:"+box.getVolume());
        System.out.println(" ");

        Box yourBox=new Box(12.2,3.5,2.0);
        System.out.println("Area of Box 2: "+yourBox.getArea());
        System.out.println("Volume of Box 2: "+yourBox.getVolume());
        System.out.println(" ");

    }
}
