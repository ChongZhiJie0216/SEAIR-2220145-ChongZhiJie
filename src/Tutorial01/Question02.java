package Tutorial01;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name?:");
        String name = scanner.nextLine();
        System.out.println("What is your title?:");
        String title = scanner.nextLine();
        System.out.println("***********************");
        System.out.println("Welcome:" +title+" "+name);
        System.out.println("***********************");
        scanner.close();
    }
}
