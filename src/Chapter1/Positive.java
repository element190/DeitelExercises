package Chapter1;

import java.util.Scanner;

public class Positive {  // Exercise 2.32
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your five integers: ");
        int integer1 = input.nextInt();
        int integer2 = input.nextInt();
        int integer3 = input.nextInt();
        int integer4 = input.nextInt();
        int integer5 = input.nextInt();

        if(integer1 <= 0 ){
            System.out.println(integer1);
        }

        if (integer1 >= 0){
            System.out.println(integer1);
        }

        if (integer1 == 0){
            System.out.println(integer1);
        }



        if(integer2 <= 0 ){
            System.out.println(integer2);
        }

        if (integer2 >= 0){
            System.out.println(integer2);
        }

        if (integer2 == 0){
            System.out.println(integer2);
        }
    }
}
