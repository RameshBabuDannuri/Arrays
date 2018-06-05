package Array.date22_05_2018;

import java.util.HashMap;
import java.util.Map;

public class KthFrequentElement {
    void find(int a[] ,  int k){
        int n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i<n ;i++){
            if (map.containsKey(a[i])){
                map.put(a[i] , map.get(a[i])+1);
            }
            else {
                map.put(a[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> e :map.entrySet()){
            if (k == e.getValue()){
                System.out.println(e.getKey()+"  => "+e.getValue());
            }
        }
    }
    public static void main(String args[]){
        int a[] = {10,20,30,20,10,20,20,50,70,70};
        KthFrequentElement obj = new KthFrequentElement();
        obj.find(a,2);
    }
}
