package Semester02.Tutorial.Tutorial05.Question03;

import java.awt.event.FocusEvent;

public class MyOWNAutoShop {
    public static void main(String[] args) {
        Sedan mySedan = new Sedan(180,20000,"Red",10);
        Ford myFord = new Ford(160,19500.00,"Black",2020,2000);
        Truck myTruck = new Truck(80,30000,"Black",2500);
        System.out.printf("My Sedan Price %.2f",mySedan.getSalesPrice());
        System.out.println(" ");
        System.out.printf("My Ford Price %.2f",myFord.getSalesPrice());
        System.out.println(" ");
        System.out.printf("My Truck Price %.2f",myTruck.getSalesPrice());
    }
}
