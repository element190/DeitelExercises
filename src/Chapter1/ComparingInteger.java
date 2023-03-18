package Chapter1;

import java.util.Scanner;

public class ComparingInteger { //2.16
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int number = input.nextInt();

        int squareNumber = number * number;

        System.out.println(number);

        if ((number >= 100) && (squareNumber >= 100)) {
            System.out.println( "The number and the square are greater");
        }

        if ((number <= 100) && (squareNumber <= 100)) {
            System.out.println( "The number and the square are lesser");
        }
    }
}
