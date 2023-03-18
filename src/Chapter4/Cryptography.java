package Chapter4;

import java.util.Scanner;

public class Cryptography { // Exercise 4.39 Done Excellently both Encryption and Decryption

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter four digits numbers: ");
        int originalNum = input.nextInt();
        int counter = 1;
        int numRemainder= 0;
        int numEncrypt1 = 0;
        int numEncrypt2 = 0;
        int numEncrypt3 = 0;
        int numEncrypt4 = 0;

        while (counter <= 4) {
            int numInteger = originalNum / 10;
            numRemainder = originalNum % 10;
            originalNum = numInteger;


            if (counter == 1) {
                numEncrypt1 = numEncrypt1 + numRemainder + 7;
            }
            if (counter == 2) {
                numEncrypt2 = numEncrypt2 + numRemainder + 7;
            }
            if (counter == 3) {
                numEncrypt3 = numEncrypt3 + numRemainder + 7;
            }

            if(counter == 4){
                numEncrypt4 = numEncrypt4 + numRemainder + 7;
            }

            counter++;
            }


        int arrange1 = numEncrypt4;
        int arrange2 = numEncrypt2;

        int arrange3 = numEncrypt3;
        int arrange4 = numEncrypt1;

        numEncrypt4 = arrange2;
        numEncrypt2 = arrange1;

        numEncrypt3 = arrange4;
        numEncrypt1 = arrange3;

        System.out.printf("%nDigit1:%d%nDigit2:%d%nDigit3:%d%nDigit4:%d%n",numEncrypt4,numEncrypt3,numEncrypt2,numEncrypt1);


            System.out.println();
            System.out.println();
            System.out.println("For decrpting codes");


            System.out.println("Enter your decryption codes: ");
            int decrytionNum = input.nextInt();
            int run = 1;
            int decryptRemainder = 0;
            int numDecrypt1 = 0;
            int numDecrypt2 = 0;
            int numDecrypt3 = 0;
            int numDecrypt4 = 0;

            while (run <= 4) {
                int numRewrite = decrytionNum / 100;
                decryptRemainder = decrytionNum % 100;
                decrytionNum = numRewrite;

                if (run == 1) {
                    numDecrypt1 = numDecrypt1 + decryptRemainder - 7;
                }
                if (run == 2) {
                    numDecrypt2 = numDecrypt2 + decryptRemainder - 7;
                }
                if (run == 3) {
                    numDecrypt3 = numDecrypt3 + decryptRemainder - 7;
                }
                if (run == 4) {
                    numDecrypt4 = numDecrypt4 + decryptRemainder - 7;
                }
                run++;
            }

            int coupled1 = numDecrypt4;
            int coupled2 = numDecrypt2;

            int coupled3 = numDecrypt3;
            int coupled4 = numDecrypt1;

            numDecrypt4 = coupled2;
            numDecrypt2 = coupled1;

            numDecrypt3 = coupled4;
            numDecrypt1 = coupled3;

            System.out.printf("%nDigit1:%d%nDigit2:%d%nDigit3:%d%nDigit4:%d%n", numDecrypt4, numDecrypt3, numDecrypt2, numDecrypt1);

        }
    }
