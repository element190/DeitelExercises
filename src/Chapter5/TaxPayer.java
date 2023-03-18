package Chapter5;

import java.util.Scanner;

public class TaxPayer { // Exercise 5.32 Done
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double taxes = 0.3;
        int total = 0;
        int counter = 1;

        System.out.println("enter entry point of 2:");
        int entry = input.nextInt();

        while(entry != -1){

            System.out.println("Enter the categories: ");
            String category = input.next();

            System.out.println("Amount bought");
            int amount = input.nextInt();

            total = total + amount;

            System.out.printf("%n%10s%10d%n",category,amount);

            counter++;

            System.out.println("enter entry point of 2:");
            entry = input.nextInt();
        }

          double totalPayTax = total * taxes;

        System.out.printf("%nCustomer TotalAmount = %d%nCustomer TotalPayTax = %.2f%n",total,totalPayTax);
    }
}
