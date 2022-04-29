package Tutorial08;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter working hours:");
        int hour =scanner.nextInt();
        System.out.print("Enter Working Types:");
        String type =scanner.next();
        double wage =calculaWage(hour,type);
        System.out.printf("Your wage is RM %.2f%n",wage);
    }
    public static double calculaWage(int hour, String type) {
        double wage =0.0;
        if (type.equals("Normal")){
            wage = hour * 80;
        } else if (type.equals("Overtime")) {
            wage = hour  * 180;
        }
        return wage;
    }
}
