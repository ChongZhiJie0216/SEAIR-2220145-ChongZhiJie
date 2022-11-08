package Semester02.Tutorial.Tutorial03;
public class Question03 {
/*    *//*double width;
    double length;
    double anawer =0;
    double anawer02 =0;
    Question03(double w,double l){
        width =w;
        length =l;
    }
    //Get Area
    void getArea(){
        double answer;
        anawer=width*length;
    }
    //Get Perimeter
    void getPerimeter(){
        double answer02;
        answer02=2*width+2*length;
    }
    void display(){
        System.out.println("Your Area Answer : "+anawer+" Width is : "+width+" Length is :"+length);
        System.out.println("Your Perimeter is :"+anawer02);
    }
    public static void main(String[] args) {
    Question03 a1 = new Question03(2,4);
    a1.getArea();
    a1.display();
    a1.getPerimeter();
    a1.display();*//*
    }*/
    double width =1 ;
    double height = 1 ;

    Question03(double w, double h){
        width = w ;
        height = h ;
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return height*2+width*2;
    }

    public static void main(String[] args) {
        Question03 rec1= new Question03(4,40);
        Question03 rec2= new Question03(3.5,35.9);

        System.out.println("Rectangle 1: "+
                "Width:"+rec1.width+"\n"+
                "Height:"+rec1.height+"\n"+
                "Area:"+rec1.getArea()+"\n"+
                "Perimeter:"+rec1.getPerimeter()+"\n");
        System.out.println("Rectangle 2: "+
                "Width:"+rec2.width+"\n"+
                "Height:"+rec2.height+"\n"+
                "Area:"+rec2.getArea()+"\n"+
                "Perimeter:"+rec2.getPerimeter()+"\n");
    }
}

