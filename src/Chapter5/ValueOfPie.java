package Chapter5;

import java.util.Scanner;

public class ValueOfPie { // Exercise 5.20 Done

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int trunc = 1;
        int i;
        int den;
        double pie = 4;
        int prec = 0;

        for (i = 0; i <= 1000; i++) {
            den = i * 2 + 3;

            if (i % 2 == 0) {
                pie -= 4.0 / den;
            } else {
                pie += 4.0 / den;
            }

            System.out.println(pie);
        }



//            if (prec < 1 && (100 * pie) == 314) {
//                System.out.printf("Found 3.14 at iteration %d\n", i);
//                prec++;
//            }
//            if (prec < 2 && (1000 * pie) == 3141) {
//                System.out.printf("Found 3.141 at iteration %d\n", i);
//                prec++;
            }
        }
