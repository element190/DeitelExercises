package Chapter6;

import java.util.Scanner;

public class Asterisk {

    public static void main(String[] args) { // Exercise 6.18 Done

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of side = ");
        int number = input.nextInt();
        asterisk(number);

    }

    public static void asterisk(int a) {

        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= a; c++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
