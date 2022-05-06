package Tutorial09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] animals ={"Cat","Dog","Rabbit","Bird","Fox"};

        while (true){
            try {
                System.out.print("Choose form 1 to 5:");
                int choice = scanner.nextInt();
                System.out.println("You caght a "+animals[choice-1]);
                break;
            }catch (ArrayIndexOutOfBoundsException arrayEX){
                System.out.println("Out of range.Please choose from 1 to 5");
            }catch (InputMismatchException inputEx){
                System.out.println("Please enter a number 1 to 5");
                scanner.nextLine();
            }catch (Exception ex){
                System.out.println("Error.");
            }
        }
    }
}
