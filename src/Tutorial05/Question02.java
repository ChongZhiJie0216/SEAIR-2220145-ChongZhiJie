package Tutorial05;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"Math", "History", "English", "Malay", "Science"};
        int[] marks = new int[5];
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("Enter your mark of %s subjec :", subjects[i]);
            marks[i] = scanner.nextInt();
        }
        System.out.println("Results:");
        int total = 0;
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%s :%d%n", subjects[i], marks[i]);
            total += marks[i];
        }
        System.out.println("Your total marks is :" + total);
        System.out.printf("Your average mark is %.1f", (double) total / 5.0);
    }
}
