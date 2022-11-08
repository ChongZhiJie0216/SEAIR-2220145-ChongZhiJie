package Semester01.Tutorial01;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Amount:RM");
        double enterAmount = scanner.nextDouble();
        double serviceTax = enterAmount * ((double) 10 / 100);
        double government = enterAmount * ((double) 6 / 100);
        System.out.printf("Total:RM %.2f %n", enterAmount);
        System.out.printf("Service Tax:RM %.2f %n", serviceTax);
        System.out.printf("Government Tax:RM: %.2f %n", government);
        scanner.close();
    }
}
