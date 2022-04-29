package Tutorial07;

import java.util.Random;

public class Question01 {
    public static void main(String[] args) {
        Random random =new Random();
        int biggest=0;
        int smallest =51;

        for (int i=0;i<5;i++){
            int randNum =random.nextInt(51);
            System.out.printf("Random Number: %d : %d%n",i+1,randNum);
            biggest =Math.max(randNum,biggest);
            smallest=Math.min(randNum,smallest);
        }
        System.out.println("The Biggest number is:"+biggest);
        System.out.println("The Smallest number is:"+smallest);
    }
}
