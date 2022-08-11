package Semester01.Tutorial06;

import java.util.ArrayList;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();

        String input = "";

        while (!input.equals("0")) {
            System.out.print("Enter your name (0 to exit):");
            input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            nameList.add(input);
        }
        System.out.println("Name List:");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.printf("%d) %s%n", i + 1, nameList.get(i));
        }
    }
}
