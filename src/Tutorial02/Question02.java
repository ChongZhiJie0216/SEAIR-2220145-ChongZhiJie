package Tutorial02;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name?:");
        String name = scanner.nextLine();
        System.out.println("Where are you from?");
        String country=scanner.next();
        if (country.equals("Malaysia")){
            System.out.println("Selamat Datang ,"+name);
        }else if (country.equals("Japan")) {
            System.out.println("Irashaimase ,"+ name);
        }else if (country.equals("China")){
            System.out.println("Ni Hao ,"+name);
        }else if (country.equals("France")){
            System.out.println("Boujour ,"+name);
        }else{
            System.out.println("Welcome ," +name);
        }
        scanner.close();
    }
}
