package Semester02.Tutorial.Tutorial02;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Pls Enter Number 01:");
        double num01 = scanner.nextDouble();

        System.out.println("Pls Enter Number 02:");
        double num02 = scanner.nextDouble();

        System.out.println("Pls Enter Number 03:");
        double num03 = scanner.nextDouble();

    }

    public static void check (double a, double b ,double c) {
        if (a>b && a>c){
            if (b>c)
                System.out.print(a+b+c);
                else
                System.out.print(a+c+b);
        } else if (b>a &&b>c) {
            if (a>c)
                System.out.print(b+a+c);
            else
                System.out.print(b+c+a);
        } else if (c>b && c>a) {
            if(b>a)
                System.out.print(c+b+a);
            else
                System.out.print(c+a+b);
        }
        System.out.println("The Number in increasing is :");

    }
}
