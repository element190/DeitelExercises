package Chapter5;

public class SumSeries { // Exercise 5.13 Done

    public static void main(String[] args) {
        final int a = 1;

        System.out.printf("%s%5s","Counter","Summation");
        for(int i = 1;i<=100;i++){
            int d = 1;
            int summation = a + (i-1)* d;
            System.out.printf("%d%5d%n",i,summation);
        }
    }
}
