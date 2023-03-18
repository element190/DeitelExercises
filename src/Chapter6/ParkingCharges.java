package Chapter6;

import java.util.Scanner;

public class ParkingCharges { // Exercise 6.8(Parking Charges) Done

    public static void main(String[] args) {

        customerName("babajide", 5);

        System.out.println("The total ParkingCharges is " + calculateCharge(20));


    }

    public static void customerName(String name, int time) {
        System.out.println("My name is " + name);
        System.out.println("My car will be here for " + time + "hours");
    }

    public static double calculateCharge(int hour) {

        double amount = 0.0;

        if (hour == 24) {
            return 10.00;
        } else if (hour <= 3) {
            return 2.00;
        } else if (hour > 3) {
            int remainder = hour - 3;
            return 2.00 + remainder * 0.5;
        }
        return amount;
    }
}

