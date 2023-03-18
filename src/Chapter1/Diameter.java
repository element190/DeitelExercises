package Chapter1;

import java.util.Scanner;

public class Diameter {
    public static void main(String[] args) { // Exercise 2.28
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your given radius : ");
        final int  radius = input.nextInt();

        final double pie = 3.14256;

        int diameter = 2*radius;

        double circumference = 2 * 3.14159 * radius;

        double area = pie * radius * radius;

        System.out.printf("%n%d diameter %n%.2f circumference %n%.3f area ", diameter, circumference,area);
    }
}
