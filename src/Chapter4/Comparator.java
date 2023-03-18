package Chapter4;

import java.util.Scanner;

public class Comparator {// Exercise 4.36 Done

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int first = input.nextInt();

        System.out.println("Enter the second number");
        int second = input.nextInt();

        if(first == second){
            System.out.println("0");
        }
        else if (first > second) {
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }
}
