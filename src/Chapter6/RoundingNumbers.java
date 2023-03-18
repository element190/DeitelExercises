package Chapter6;

import java.util.Scanner;

public class RoundingNumbers { //Exercise 6.9, Exercise 6.14(floor) Done

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        double x = input.nextDouble();

        System.out.println("Enter the value of y: ");
        double y = input.nextDouble();

        double addition = y + x;

        System.out.println(floor(x,y));
    }

    public static int floor(double x, double d) {
        int numEncrypt2 = 0;
        int counter = 1;
        int commutation = 0;

        double result = 0;
        result = x + d;
        double permutation = result * 10;
        commutation = ((int) permutation);

        int numInteger = commutation / 10;

        numEncrypt2 = numEncrypt2 + numInteger;

        return numEncrypt2;
    }
}