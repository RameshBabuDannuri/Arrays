package date20_05_2018;

import java.util.*;

public class FormBiggestNumber {
    static void print(ArrayList<String> arr){
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                String xy = x+y;
                String yx = y+x;

                return xy.compareTo(yx)>0?-1:1;
            }
        });
        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();



       /* arr.add("9");
        arr.add("7");
        arr.add("876");
        arr.add("5");
        arr.add("69");
        */
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        print(arr);
    }

}
