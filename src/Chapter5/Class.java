package Chapter5;

public class Class {

    public static void main(String[] args) {

        int [] array = {1,3,4,12};

        for(int i = 0;i<array.length;i++){
            if (array[1] + array[2] == 7) {
                System.out.printf("%d,%d",array[1], array[2]);
                break;
            }
        }
    }
}
