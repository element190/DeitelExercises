package Chapter6;

import java.util.ArrayList;

public class Reverse {

    public static void main(String[] args) {

        int [] arrays = {12,3,6,20};

        ArrayList <Integer> items = new ArrayList<Integer>();

        for(int i = arrays.length-1;i>=0;i--){
            //System.out.println(arrays[i]);
            items.add(arrays[i]);
        }
        System.out.print(items);
    }
}
