package Chapter4;

import java.util.Scanner;

public class ReadingNumbers {// Exercise 4.34 and Exercise 4.35 Done

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter the beginning number");
        int number = input.nextInt();

        System.out.println("Enter '-1' if you want to exit d loop");
        int exit = input.nextInt();

        while(exit != -1){
            System.out.println("Enter the consequent numbers:");
            int addition = input.nextInt();
            sum = sum + addition;
                if(sum >= number){
                    System.out.println("The sum is equal to the beginning number");
                    break;
                }
        }
    }
}
