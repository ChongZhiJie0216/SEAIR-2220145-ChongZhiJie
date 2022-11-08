package Semester01.Tutorial03;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter your gender (F/M): ");
            if (scanner.next().equals("F")) {
                total++;
            }
        }
        System.out.println("Total of Male: " + (10 - total));
        System.out.println("Total of Female: " + total);
        scanner.close();
    }
}

/*
for (开始(从哪里开始); 条件(达到什么条件时候停止); 每运行一次的做一次结果) {}
while (条件(一直运行到符合条件为止)) {}
 */