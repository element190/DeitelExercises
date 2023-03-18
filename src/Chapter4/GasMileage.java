package Chapter4;
import java.util.Scanner;

public class GasMileage { //Exercise 4.17 Done
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.println("Enter the (exit code = -1) to exit d loop:  ");
        int run = input.nextInt();

        float total = 0;
        int gradecounter = 0;

        while(run != -1){
            System.out.println("Enter the miles: ");
            float mile = input.nextFloat();

            System.out.println("Enter the gallons used: ");
            float gallon = input.nextFloat();

            System.out.println("Description of trip: ");
            int description = input.nextInt();

            float average = mile/gallon;


            System.out.printf("The average for this trip %d is %.2f%n",description, average);

            total = total + average;

            gradecounter = gradecounter + 1;

            System.out.println("Enter the (exit code = -1) to exit d loop:  ");
            run = input.nextInt();
        }

        System.out.printf("The combined %dtrips is: %.3f ",gradecounter, total);
    }
}

