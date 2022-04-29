package Tutorial07;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter IC Number (xxxxxx-xx-xxxx):");
        String ic = scanner.next();
        String month =ic.substring(2,4);
        String date = ic.substring(4,6);

        System.out.println("Birthday Month:"+month);
        System.out.println("Birthday Date:"+date);
    }
}
