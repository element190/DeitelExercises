package Chapter4;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = 1;
        int product = 1;
        int n = 3;
        int unit = 1;
        int y = 1;
        int w = 1;

        while (p < 3) {
            int i = 1;
            while (i <= 4) {
                product = p * product;
                System.out.printf("%5d", product);
                i++;
            }
            System.out.println(" ");
            p++;
        }

        while (n < 5) {
            while (w <= 4) {
                if (n == 4 || n == 3) {
                    int quantity = 1;
                    quantity = n * quantity;
                    System.out.printf("%5d", quantity);
                    w++;
                }
                System.out.println(" ");
                n++;

            }
        }
    }
}