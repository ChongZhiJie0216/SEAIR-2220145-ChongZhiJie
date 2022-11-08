package Semester02.Exercise.Exercise01;

public class Exe02 extends Exercise1 {
    String mainSubject;

    Exe02(){
        mainSubject = "Exercise1";
    }

    public static void main(String[] args) {
        Exe02 teacher1 = new Exe02();
        System.out.println(teacher1.Disignation);
        System.out.println(teacher1.collegeName);
        System.out.println(teacher1.mainSubject);
        teacher1.does();
    }
}
