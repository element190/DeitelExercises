package Chapter4;

import java.util.Scanner;

public class DecimalBinaryNumber { //Exercise 4.32 Done
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int counter = 1;
        double m = 0; // m is square incremental value

        System.out.println("Enter length of numbers: ");
        int length = input.nextInt();

        while(counter <= length){
            System.out.println("Enter the number from right to left");
            int movement = input.nextInt();

            double result = movement * Math.pow(2.0,m);
            sum = sum + result;
            m++;
            counter++;
        }

        System.out.println("Total value of the binary is " + sum);
    }
}
