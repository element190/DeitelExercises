package Chapter6;

import java.security.SecureRandom;

public class Statement { //Exercise 6.13  Done

    public static void main(String[] args) {

        SecureRandom randomNumber = new SecureRandom();

        int face = 3 + randomNumber.nextInt(12);

        System.out.println(face);
    }
}
