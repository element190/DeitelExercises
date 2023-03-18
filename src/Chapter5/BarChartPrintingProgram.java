package Chapter5;

import java.util.Scanner;

public class BarChartPrintingProgram { // Exercise 5.16 Done
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println();
            System.out.println("Enter numbers from 1 to 30: ");
            int number = input.nextInt();
            for (int y = 1; y <= number; y++) {
                System.out.print("*");
            }
        }
    }
}
