package Semester02.Tutorial03;

public class Question02 {
    int id;
    String name;

    Question02(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println("ID :" + id + " Name:" + name);
    }

    public static void main (String[]args){
        Question02 s1 = new Question02 (17198,"Kopi O");
        s1.display();
        Question02 s2 = new Question02 (11182,"123");
        s2.display();
    }
}
