package Chapter6;

import java.util.Scanner;

public class Character { //Exercise 6.19 Done

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of side = ");
        int number = input.nextInt();

        System.out.println("Enter your words:");
        char alphabet = input.next().charAt(1);


        asterisk(number,alphabet);
    }

    public static void asterisk(int side,char fillCharacter) {

        for (int b = 1; b <= side; b++) {
            for (int c = 1; c <= side; c++) {
                System.out.print(fillCharacter);
            }
            System.out.println(" ");
        }
    }
}
