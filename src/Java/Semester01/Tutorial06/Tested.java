package Semester01.Tutorial06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> marksList = new ArrayList<Integer>();
        int mark = 0;
        while (mark != -1) {
            System.out.println("Enter mark (-1 to exit):");
            mark = scanner.nextInt();
            if (mark == -1) {
                break;
            }
            marksList.add(mark);
        }
        Collections.sort(marksList, Collections.reverseOrder());
        System.out.println("Higest Marks:");
        for (int i = 0; i < marksList.size(); i++) {
            System.out.printf("%d. %d%n", i + 1, marksList.get(i));
            if (i >= 2) {
                break;
            }
        }
    }
}
