package Chapter4;

import java.util.Scanner;

public class CheckerBoard { // Exercise 4.33 Done
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // If i want to make the stars scatter aboard
//        System.out.println("Enter (-1) to exit the loop");
//        int exit = input.nextInt();

//        while (exit != -1) {
//            System.out.print("* ");
//            System.out.print(" ");
//            //System.out.println();
//        }


        // when i want the stars to be in d length of 8 and be precise

            int counter = 1;

            while(counter <= 200){
                System.out.print("* ");
                System.out.print(" ");

                if(counter % 8 == 0){
                    System.out.println();
                }
                counter++;
            }
    }
}
