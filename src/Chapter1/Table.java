package Chapter1;

public class Table {
    public static void main(String[] args) {  //Exercise 2.31
        System.out.printf("%n%8s%12s%13s", "number", "square", "cube" );

        int number = 2;
        int squaredNumber = number * number;
        int cubeNumber = number * number* number;

        System.out.printf("%n%8s%12s%13s", number , squaredNumber,cubeNumber );

        int numberThird = 3;
        int squaredNumberThird = numberThird * numberThird;
        int cubeNumberThird = numberThird * numberThird* numberThird;

        System.out.printf("%n%8s%12s%13s", numberThird , squaredNumberThird, cubeNumberThird);


        int numberF = 4;
        int squaredNumberFourth = numberF * numberF;
        int cubeNumberFourth = numberF * numberF * numberF;

        System.out.printf("%n%8s%12s%13s", numberF , squaredNumberFourth, cubeNumberFourth);
    }
}
