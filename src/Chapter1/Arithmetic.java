package Chapter1;

import java.util.Scanner;
public class Arithmetic { //2.15

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first integer and second integers: ");
        int integer1 = input.nextInt();
        int integer2 = input.nextInt();

        int squareInteger1 = integer1 * integer1;
        int squareInteger2 = integer2 * integer2;

        int diff =  squareInteger1 - squareInteger2;
        int add = squareInteger1 + squareInteger2;

        System.out.printf("%n%d%n%d",squareInteger1,squareInteger2);
        System.out.printf("%n%d%n%d", diff, add);
    }
}
