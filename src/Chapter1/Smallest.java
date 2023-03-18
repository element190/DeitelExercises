package Chapter1;

import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) { // 2.17

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first,second and third integers: ");
        int integer1 = input.nextInt();
        int integer2 = input.nextInt();
        int integer3 = input.nextInt();

        int sum = integer1 + integer2 + integer3;

        int average = sum / 3;

        int product = integer1 * integer2 * integer3;



        boolean temp = integer1 > integer2;
        boolean ramp = integer3 > integer1;

        if (integer3 > integer1) {
            System.out.println("Integer 3 is greater than temp");
        }
        if (integer2 > integer1) {
            System.out.println("Integer2 is greater than integer1");
        }
        else{
            System.out.println("integer1 is greater");
        }
    }
}