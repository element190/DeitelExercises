package Chapter5;

public class CodeRun { // Exercise 5.27 Done
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int u = 1; u <= 4; u++) {
                    System.out.print('*');
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
