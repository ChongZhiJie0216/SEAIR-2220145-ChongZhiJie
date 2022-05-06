package Tutorial09;

import java.util.Scanner;

public class Question01 {
    public static void main(String[]args) {
        Scanner scan=new Scanner(System.in);
        int total=0;
        for(int i=0;i<5;i++) {
            try {
                System.out.print("Enter Number:");
                int number = scan.nextInt();
                total+=number;
            }catch(Exception ex ) {
                System.out.println("Please enter a number");
                scan.nextLine();
                i--;
            }
        }
        System.out.println("Total is "+total);
    }
}

