package Chapter6;

import java.util.Scanner;

public class LeapYear { // Exercise 6.20 Done

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year to calculate: ");
        int year = input.nextInt();

        System.out.println(isLeapYear(year));

    }

    public static boolean isLeapYear(int b){
        if(b % 400 ==0 || b % 4 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
