package Chapter4;

import java.util.Scanner;

public class WorldPopulationGrowth {// Exercise 4.40: Done

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double growthRate = 1;
        int year = 1;

        System.out.println("Enter your populace: ");
        int populace = input.nextInt();

        System.out.printf("%n%6s%20s%n","Year","Population");

        while(year <= 75){
            double population = populace * Math.pow(1 + growthRate/100,year);
            if(population == 2 * populace){
                System.out.println("This year is doubled populace");
            }
            System.out.printf("%n%6d%20.3f", year, population);
            year++;
        }

    }
}
