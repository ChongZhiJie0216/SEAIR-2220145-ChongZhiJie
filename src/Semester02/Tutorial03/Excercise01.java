package Semester02.Tutorial03;

import javax.xml.namespace.QName;

public class Excercise01 {
        int mark;
        String name;
        Excercise01(){
            System.out.println("Hello 1");
        }
        //Two Arg
        Excercise01(String n){
            name = n ;
        }
        //Three Atg
        Excercise01(String n,int m){
            name = n ;
            mark = m ;
        }
        void display(){System.out.println("Students Names is :"+name+" "+"Marks is:" +mark);}
    public static void main(String[] args) {
        Excercise01 s1 =new Excercise01 ("Mr.KFC");
        Excercise01 s2 =new Excercise01 ("Mr.Hallo",255);
        s1.display();
        s2.display();
    }
}



