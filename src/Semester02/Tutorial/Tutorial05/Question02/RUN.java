package Semester02.Tutorial.Tutorial05.Question02;

public class RUN {
    public static void main(String[] args) {
        Rec rec1 = new Rec();
        Triangle tri1 = new Triangle();

        rec1.setValues(5.3,8.3);
        tri1.setValues(5,10);

        System.out.println("Area of Rectangle: "+rec1.getArea());
        System.out.println("Area of Triangle: "+tri1.getArea());

    }
}
