package Chapter1;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) { //Exercise 2.26

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer and second integer");
        int integer1 = input.nextInt();
        int integer2 = input.nextInt();

        int triple1 = integer1 * integer1 * integer1;

        int multiple2 = integer2 * integer2;

        if(triple1 % multiple2 == 0){
            System.out.println("Its true");
        }
        else{
            System.out.println("its not possible");
        }
    }
}
