package Chapter1;

public class WorldPopulation {
    public static void main(String[] args) {

        double worldPopulation21 = 7.888888888;

        double worldPopulation22 = 8.000000000;

        int t = 4;

        double n = worldPopulation22 - worldPopulation21;

        double growth = n/t;

        System.out.printf("The different between the old population of 21 and 22 is : %.6f",n);

        System.out.printf("%n%.5f" , growth);
    }
}
