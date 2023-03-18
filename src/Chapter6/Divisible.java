package Chapter6;

import java.util.Scanner;

public class Divisible { //Exercise 6.17 Done

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 1;

        do{
            System.out.println("Enter your 1 to 10 input:");
            int number = input.nextInt();

            System.out.println(isDivisible(number));
            counter++;

        } while (counter <= 10);


    }

    public static boolean isDivisible(int b){
        boolean divisible;
        if(b % 5 == 0){
            return true;
        }
        else{
            return false;
        }

    }
}
