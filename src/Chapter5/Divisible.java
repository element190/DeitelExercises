package Chapter5;

import java.util.Scanner;

public class Divisible { // Exercise 5.12 Done
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;


        for(int i = 1;i<=30;i++){
            if(i % 3 == 0){
               sum += i;
            }
        }

        System.out.println("The sum is " + sum);
    }
}
