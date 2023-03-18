package Chapter1;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) { //2.25

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your integer");
        int number = input.nextInt();

        if (number % 3 == 0) {
            System.out.println("the number is divisible");
        } else {
            System.out.println("Its not divisible");

        }
    }
}