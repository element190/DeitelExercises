package Chapter4;

public class RightAngledTriangle { //Exercise 4.30 Done
    public static void main(String[] args) {
        int baselength = 1;

        while(baselength <= 10){
            int i = 1;
            while(i <= baselength){
                System.out.print("*");
                i++;}
            System.out.println();
            baselength++;
            }
        }
    }
