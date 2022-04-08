package Tutorial05;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String[] fruits =new String[5];
        for(int i=0;i<fruits.length;i++){
            System.out.print("Enter fruit:");
            String fruit =scanner.next();
            if(Arrays.asList(fruits).contains(fruit)){
                System.out.println("The fruit has been entered before.Please enter another fruit:");
                i--;
            }else {
                fruits[i] =fruit;
            }
        }
        Arrays.sort(fruits);
        System.out.println("Your Fruit List:");
        for(int i=0;i<fruits.length;i++){
            System.out.printf("%d,%s%n",i+1,fruits[i]);
        }
    }
}
