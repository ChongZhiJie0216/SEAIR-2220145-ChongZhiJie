package Tutorial04;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ender a Number:");
        int number = scanner.nextInt();
        String operator = "";
        int answer = number;
        String formula = String.valueOf(number);

        while (!operator.equals("=")) {
            System.out.print("Enter Operator(+ or - or * or =)");
            operator = scanner.next();
            if (operator.equals("=")) {
                break;
            }
            System.out.print("Enter a Number:");
            number = scanner.nextInt();
            if (operator.equals("+")) {
                answer += number;
                formula += " " + operator + " " + number;
            } else if (operator.equals("-")) {
                answer -= number;
                formula += " " + operator + " " + number;
            } else if (operator.equals("*")) {
                answer *= number;
                formula += " " + operator + " " + number;
            }
        }
        System.out.println("Answer is :" + formula + " = " + answer);
        scanner.close();
    }
}