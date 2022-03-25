//仅供参考，出事自负//
package Tutorial04;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operator;
        String lastOperator = "";
        String resultString = "";
        int answer = 0;
        do{
            System.out.println("Enter number:");
            int input = scanner.nextInt();

            System.out.println("Choose an operator (+ or – or * or =) :");
            operator = scanner.next();

            switch (operator.equals("=") ? lastOperator : operator) {
                case "+":
                    answer += input;
                    resultString += input + " + ";
                    break;
                case "-":
                    answer -= input;
                    resultString += input + " - ";
                    break;
                case "*":
                    answer *= input;
                    resultString += input + " * ";
                    break;
            }
            if(operator.equals("=")) {
                resultString = resultString.substring(0, resultString.length() - 3);
                System.out.println(resultString + " = " + answer);
            }
            lastOperator = operator;
        }while (!operator.equals("="));
        scanner.close();

//       d o{
//            System.out.println("Enter number:");
//            int num01 = scanner.nextInt();
//            System.out.println("Choose an operator (+ or – or * or =) :");
//            operator = scanner.next();
//            System.out.println("Enter number:");
//            int num02 = scanner.nextInt();
//            int answer = 0;
//            switch (operator){
//                case "+":answer = num01+num02;break;
//                case "-":answer = num01-num02;break;
//                case "*":answer = num01*num02;break;
//                default:System.out.println("输入不合法");
//            }
//    }while(!operator.equals("="));
    }
}
