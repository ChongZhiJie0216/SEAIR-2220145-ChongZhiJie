package Tutorial08;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("What is your First Name?");
        String fname =scanner.nextLine();
        System.out.print("What is your Last Name?");
        String lname =scanner.nextLine();
        System.out.print("Where your come from?");
        String country = scanner.nextLine();
        greet(fname,lname,country);
    }

    public static void greet(String firstname,String lastname,String country) {
        String msg ="";
        if (country.equals("Malaysia")){
            msg ="Selamat Datang";
        }else if(country.equals("Japan")){
            msg = "Irashaimase";
        } else if (country.equals("China")) {
            msg ="Ni Hao";
        } else if (country.equals("France")) {
            msg ="Bonjour";
        }else {
            msg ="Welcome";
        }
        System.out.printf("%s, %s %s",msg,firstname,lastname);
    }
}
