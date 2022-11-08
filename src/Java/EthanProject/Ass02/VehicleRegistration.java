package EthanProject.Ass02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleRegistration {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[40];

        int input = -1; // start the loop
        int index = 0;

        Scanner sc = new Scanner(System.in);

        while(input != 0) {
            while(input < 0 || input > 3) {
                showMainMenu();
                System.out.print("Enter Option: ");
                try {
                    input = sc.nextInt();
                }catch(InputMismatchException ex) {
                    System.out.println("Invalid input! Please enter a number from the option.");
                    sc.nextLine();
                    break;
                }

                if(input < 0 || input > 3) {
                    System.out.println("Invalid input! Please enter a number from the option.");
                }
            }


            if(input == 0) {
                System.out.println("Thank you for using this program.");
                sc.close();
                return;
            }

            String model = "";
            String color = "";
            String transmission = "";

            switch(input) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    model = sc.next();
                    System.out.print("Enter Car Color: ");
                    color = sc.next();
                    System.out.print("Auto/Manual: ");
                    transmission = sc.next();

                    while(!transmission.equals("Auto") && !transmission.equals("Manual")) {
                        System.out.print("Auto/Manual: ");
                        transmission = sc.next();
                    }

                    Car car = new Car(model, color, transmission);
                    System.out.println("The color of this vehicle is " + car.getColor());
                    System.out.println("The model of this vehicle is " + car.getModel());
                    System.out.println("The transmission for this vehicle is " + car.getTransmission());
                    System.out.println("The number of wheels in this vehicle is " + car.getWheel());
                    System.out.println("-----------------------------");
                    vehicles[index] = car;
                    index++;
                    break;
                case 2:
                    System.out.print("Enter Motorbike Model: ");
                    model = sc.next();
                    System.out.print("Enter Motorbike Color: ");
                    color = sc.next();

                    Motorbike motor = new Motorbike(model, color);
                    System.out.println("The color of this vehicle is " + motor.getColor());
                    System.out.println("The model of this vehicle is " + motor.getModel());
                    System.out.println("The transmission for this vehicle is na");
                    System.out.println("The number of wheels in this vehicle is " + motor.getWheel());
                    System.out.println("-----------------------------");
                    vehicles[index] = motor;
                    index++;
                    break;
                case 3:
                    System.out.println("No. of Parked vehicles: " + (index));
                    System.out.println("No. of Available Spots: " + (vehicles.length - (index)));
                    System.out.println("====================\n");
                    System.out.println("List of All Parked Vehicles is as follows:");
                    System.out.println("-----------------------------\n");

                    for(int i = 0; i < index; i++) {
                        System.out.print("|" + vehicles[i].getModel() + "|");
                    }
                    System.out.println();
                    System.out.println("-----------------------------\n");
                    break;
            }

            input = -1; // reset the input to loop
        }

        sc.close();

    }

    public static void showMainMenu() {
        System.out.println("NEUC Car Management and Parking System");
        System.out.println("1. Car Registration");
        System.out.println("2. Motorbike Registration");
        System.out.println("3. Parking Status");
        System.out.println("0. Exit");
    }

}
