package Chapter4;

import java.util.Scanner;

public class CreditLimitCalculator { // Exercise 4.18 Done

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradecounter = 0;

        System.out.println("Enter your exit code(-1) to exit d loop: ");
        int run = input.nextInt();

        while (run != -1) {

            System.out.println("Enter your account number: ");
            int accountNumber = input.nextInt();

            System.out.println("Enter your balanceAtTheBeginOfMonth: ");
            int balanceAtTheBeginOfMonth = input.nextInt();

            System.out.println("Enter your totalItemsChargedByCustomerMonthly: ");
            int totalItemsChargedByCustomerMonthly = input.nextInt();

            System.out.println("Enter your creditAppliedToEachCustomer: ");
            int creditAppliedToEachCustomer = input.nextInt();

            System.out.println("Enter your allowedCreditLimit: ");
            int allowedCreditLimit = input.nextInt();

            int newBalance = balanceAtTheBeginOfMonth + totalItemsChargedByCustomerMonthly - creditAppliedToEachCustomer;

            gradecounter = gradecounter + 1;


            System.out.printf("""
                    %nThe Details for the Customer %d are displayed below
                    AccountNumber : %d
                    BalanceAtTheBeginOfMonth : %d
                    TotalItemsChargedByCustomerMonthly: %d
                    CreditAppliedToEachCustomer: %d
                    AllowedCreditLimit: %d%n
                    NewBalance: %d%n
                    """,gradecounter,accountNumber, balanceAtTheBeginOfMonth, totalItemsChargedByCustomerMonthly, creditAppliedToEachCustomer, allowedCreditLimit, newBalance);

            if (newBalance > allowedCreditLimit) {
                System.out.println("Credit Limit exceeded");
            } else {
                System.out.println("You are Eligible");
            }

            System.out.println("Enter your exit code(-1) to exit d loop: ");
            run = input.nextInt();

        }
    }
}
