package Chapter4;

import java.util.Scanner;

public class TaxCalculator { // Exercise 4.20 Done
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double taxRate1 = 0.15;
        final double taxRate2 = 0.20;

        int run = 1;

        while(run <= 3) {
            System.out.println("Enter Customer's Id: ");
            int customerId = input.nextInt();

            System.out.println("Enter your earning: ");
            int earning = input.nextInt();

            double total;

            if (earning <= 30000) {
                total = earning * taxRate1;
            } else {
                total = earning * taxRate2;
            }

            System.out.printf("""
                    %nCustomer Id = %d
                    Customer Earning = %d
                    Customer Total = %.2f%n
                    """, customerId, earning, total);

            run = run + 1;
        }
    }
}
