package Assignment01;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] food= {"Burger","Apple Pie","French Fries","Sprite","Milo-Ice"};
        double[] price = {5.20,3.20,5.00,2.50,3.50};

        System.out.println("-----------Menu-----------");
        System.out.println("Food             Price(RM)");
        System.out.println("1.Burger              5.20");
        System.out.println("2.Apple Pie           3.20");
        System.out.println("3.French Fries        5.00");
        System.out.println("4.Sprite              2.50");
        System.out.println("5.Milo-Ice            3.50");
        System.out.println("--------------------------");

        int meal= 0;
        int qty = 0;
        String cont= "Y" ;
        while (cont.equals("Y")) {
            System.out.println("Choose your meal:");
            meal = scanner.nextInt();
            System.out.println("Please enter the quantity:");
            qty = scanner.nextInt();
            System.out.println("Continue?(Y/N):");
            cont = scanner.next();
        }
    }
}
