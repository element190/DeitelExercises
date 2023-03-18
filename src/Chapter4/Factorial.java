package Chapter4;

import java.util.Scanner;

public class Factorial { // Exercise 4.38A done, 4.38B, 4.38C
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // For Part A of 4.38
//        int i = 1;
//        int product = 1;
//
//        System.out.println("Enter the factorial: ");
//        int factorial = input.nextInt();
//
//
//        while(i <= factorial){
//            product = product * factorial;
//            factorial--;
//        }
//        System.out.println(product);
//    }

        // For Part B;
        int i = 10;
        double product = 1.0;

        System.out.println("Enter the factorial: ");
        double factorial = input.nextDouble();

        while (i >= factorial) {
            product = product + (1 / factorial);
            factorial++;
        }
        System.out.println(product);

    }
}
