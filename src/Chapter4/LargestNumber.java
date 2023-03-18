package Chapter4;

import java.util.Scanner;

public class LargestNumber { // Exercise 4.21 Done
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int quantity = 0;

        while(i <= 5){
            System.out.println("Enter the number of units sold: ");
            int number = input.nextInt();

            if(i==1){
                quantity = number;
            }
            else if(number > quantity){
                quantity = number;
            }
            i = i + 1;
        }
        System.out.println("the maximum of " + quantity);

    }
}
