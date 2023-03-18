package Chapter6;

import java.util.Scanner;

public class Multiple { // Exercise 6.16 Done

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 1;

        do{
            System.out.println("Enter first number:");
            int a = input.nextInt();

            System.out.println("Enter second number:");
            int b = input.nextInt();

            System.out.println(isMultiple(a,b));
            counter++;

        } while (counter <= 10);
    }

    public static boolean isMultiple(int a,int b){
        boolean multiple;

        if(b%a == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
