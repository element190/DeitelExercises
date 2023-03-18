package Chapter5;

public class DeMorganLaw {

    public static void main(String[] args) { // Exercise 5.23 Done

        int x = 9;
        int y = 5;

        boolean z = !(x < 5);
        boolean k = !(y >= 7);

        boolean g = z && k;

        System.out.println(g);

    }
}
