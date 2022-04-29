package Tutorial04;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("---------------------------------");
        System.out.println("A.Chicken Chop");
        System.out.println("B.Banana Pie");
        System.out.println("C.Carrot Milk");
        System.out.println("D.Chicken Burger");
        System.out.println("E.Spaghetti Bolognese");
        System.out.println("---------------------------------");

        String meal = "";
        double total = 0;
        String cont = "Y";
        while (cont.equals("Y")) {
            System.out.println("Choose your meal:");
            meal = scanner.next();
            switch (meal) {
                case "A" -> total += 12.00;
                case "B" -> total += 5.00;
                case "C" -> total += 3.60;
                case "D" -> total += 6.20;
                case "E" -> total += 8.90;
            }
            System.out.println("Continue?(Y/N):");
            cont = scanner.next();
        }
        System.out.printf("The Total Amount is:RM%.2f %n", total);
        System.out.println("Thank you");
    }
}