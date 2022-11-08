package Semester01.Tutorial02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Score?:");
        int score = scanner.nextInt();
        String grade = "";
        if (score >= 70) {
            grade = "A";
        } else if (score >= 60) {
            grade = "B";
        } else if (score >= 50) {
            grade = "C";
        } else if (score >= 40) {
            grade = "B";
        } else {
            grade = "F";
        }
        scanner.close();
        System.out.println("Grade is " + grade);
    }
}
