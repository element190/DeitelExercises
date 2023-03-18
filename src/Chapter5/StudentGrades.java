package Chapter5;

import java.util.Scanner;

public class StudentGrades { // Exercise 5.17 Done
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.println("Input the grades: ");
            String grade = input.nextLine();

            switch (grade) {
                case "a":
                    ++aCount;
                    break;
                case "b":
                    ++bCount;
                    break;
                case "c":
                    ++cCount;
                    break;
            }
        }

        System.out.printf("Count of A : %d%nCount of B : %d%nCount of C : %d%n",aCount,bCount,cCount);
    }
}
