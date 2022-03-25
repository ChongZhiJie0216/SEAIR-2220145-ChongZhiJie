package Tutorial03;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-10):");
        int number = scanner.nextInt();
        System.out.println("-----------------------");
        System.out.println("Multiplication Table of "+ number);
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
        scanner.close();
    }
}
