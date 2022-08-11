package Semester02.Tutorial02;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scann =new Scanner(System.in);

        System.out.print("Enter a Int:");
        int number = scann.nextInt();

        System.out.println("The Sum of the digit "+number+" is "+ DigitSum(number));
    }
    public static int DigitSum(int n){
        int sum =0;
        while (n>0){
            sum=sum+(n%10);
            n /=10 ;
        }
        return sum;
    }
}
