package Tutorial06;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] nameList = {
                {"Kenny", "Wong", "SEDSC"},
                {"Tan", "Joo Lin", "SEDSC"},
                {"Susan", "Chan", "ITNET"},
                {"Lim", "Ken Loong", "SEDSC"},
                {"Soo", "Choy Wah", "ITCSI"},
                {"Tommy", "Tong", "ITNET"},
                {"Jerry", "Chong", "ITCSI"},
        };
        System.out.print("Enter course code:");
        String course = scanner.next();
        System.out.println("Student Name List of :" + course);
        int count = 0;
        for (int i = 0; i < nameList.length; i++) {
            if (nameList[i][2].equals(course)) {
                count++;
                System.out.printf("%d) %s %s%n", count, nameList[i][0], nameList[i][1]);
            }
        }
    }
}
