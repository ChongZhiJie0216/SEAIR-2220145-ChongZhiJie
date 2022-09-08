package Semester02.Exercise.Exercise02;

public class Cars extends mxSpeed {
    static int maxSpeed=180;
    void display() {
        System.out.println("Maximum speed: " +super.maxSpeed);
        System.out.println("Maximum Speed for Car:"+ Cars.maxSpeed);
    }
}
