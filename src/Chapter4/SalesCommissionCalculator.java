package Chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator { // Exercise 4.19
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double product1 = 239.99;
        final double product2 = 129.75;
        final double product3 = 99.95;
        final double product4 = 350.89;

        int gradecounter = 0;

        System.out.println("Enter your exit code(-1) to exit d loop: ");
        int run = input.nextInt();

        while (run != -1) {
            System.out.println("Quantity sold on Product1: ");
            int quantityProduct1 = input.nextInt();
            double totalQuantityProduct1 = (product1 * quantityProduct1);


            System.out.println("Quantity sold on Product2: ");
            int quantityProduct2 = input.nextInt();
            double totalQuantityProduct2 =(product2 * quantityProduct2);


            System.out.println("Quantity sold on Product3: ");
            int quantityProduct3 = input.nextInt();
            double totalQuantityProduct3 = (product3 * quantityProduct3);


            System.out.println("Quantity sold on Product4: ");
            int quantityProduct4 = input.nextInt();
            double totalQuantityProduct4 =(product4 * quantityProduct4);

            double result = (totalQuantityProduct1 + totalQuantityProduct2 + totalQuantityProduct3 + totalQuantityProduct4) ;

            gradecounter = gradecounter + 1;

            System.out.printf("""
                    %nThe Details for the Customer %d are displayed below
                    TotalQuantityProduct1: %.2f
                    TotalQuantityProduct2: %.2f
                    TotalQuantityProduct3: %.2f
                    TotalQuantityProduct4: %.2f
                    result: #%.2f
                    """,gradecounter,totalQuantityProduct1, totalQuantityProduct2, totalQuantityProduct3, totalQuantityProduct4, result);


            System.out.println("Enter your exit code(-1) to exit d loop: ");
            run = input.nextInt();

        }
    }
}
