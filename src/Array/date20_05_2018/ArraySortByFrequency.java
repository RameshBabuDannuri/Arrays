package Array.date20_05_2018;

import java.util.*;

public class ArraySortByFrequency {

    public static void FrequencySort(int a[], int n){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0 ; i<n;i++){
            if (map.containsKey(a[i])){
                int count  = map.get(a[i]);
                count++;
                map.put(a[i],count);
            }
            else {
                map.put(a[i],1);
            }
        }
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<Map.Entry<Integer, Integer>>(set);


        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }

        });
         Iterator it = list.iterator();
        int j=0;
        for(Map.Entry<Integer, Integer> entry:list)
        {

          for (int  i = 0 ;j<n && i<entry.getValue() ; i++){
              a[j] = entry.getKey();
              j++;
          }
        }
         for (int i = 0 ; i<n; i++){
           System.out.print(a[i]+" ");
         }
    }
    public static void main (String args[]){
        int a[] = {2,3,2,6,5,4,12,2,3,3,3,12,12,1,2,3};
        FrequencySort(a,a.length);

    }
}
