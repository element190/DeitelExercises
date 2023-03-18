package Chapter5;

import java.util.Scanner;

public class Extremes { // Exercise 5.11 Done


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minimum= 0;
        int maximum=0;

        for(int counter = 1;counter<=4;counter++){
            System.out.println("Enter the numbers: ");
            int number = input.nextInt();

            if(counter == 1){
               maximum = number;
               minimum = number;
            }

            else if(number > maximum){
                maximum = number;
            }

            else if(number < minimum){
                minimum = number;
            }

        }
         int sum = minimum + maximum;
        System.out.println("Minimum is " + minimum);
        System.out.println("Maximum is " + maximum);
        System.out.println("Sum is " + sum);
    }
}
