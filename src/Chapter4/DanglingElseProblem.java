package Chapter4;

public class DanglingElseProblem {// Exercise 4.27 and Exercise 4.28

    // Exercise 4.29 All Done
    public static void main(String[] args) {
        int x = 12;
        int y = 10;
//        if (x > 5) {
//            if (y > 5) {
//                System.out.println("x and y are > 5");
//            } else {
//                System.out.println("x is <= 5");
//            }
//        }
//        if (x < 10) {
//            if (y > 10) {
//                System.out.println("*****");
//            } else {
//                System.out.println("#####");
//                System.out.println("$$$$$");
//            }

        if (y == 7) {
            if (x == 5) {
                System.out.println("@@@@@");} }

            else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }
}
