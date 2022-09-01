package Semester02.Tutorial.Tutorial03;

public class Question01 {
    int Num1,Num2,Num3;

    Question01(){
        System.out.println("Sum Hello");
    }
    Question01(int n1,int n2){
        Num1=n1;
        Num2=n2;
    }
    Question01(int n1,int n2,int n3){
        Num1=n1;
        Num2=n2;
        Num3=n3;
    }

    void calculate(){
        int sum =0;
        if(Num3 ==0){
            sum =Num1+Num2;
            System.out.println("The Sum of 2 different numbers is :"+sum);
        }else {
            sum =Num1+Num2+Num3;
            System.out.println("The Sum of 3 different numbers is :"+sum);
        }

    }

    public static void main(String[] args) {
        Question01 q1 = new Question01 (20,30);
        Question01 q2 = new Question01 (30,30,50);
        q1.calculate();
        q2.calculate();
    }
}
