package Tutorial02;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age?:");
        int age = scanner.nextInt();
        if (age <=5){
            System.out.println("Fee is RM0.00");

        } else if (age >=65){
            System.out.println("Fee is RM9.50");
        }
        else{
            System.out.println("Fee is RM20.00");
        }
        scanner.close();
    }
}
