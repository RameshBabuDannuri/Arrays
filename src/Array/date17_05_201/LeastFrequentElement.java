package Array.date17_05_201;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
Look at LinkedHashMap
Look at LinkedList before it
Implement your own LinkedHashMap
Implement your own HashMap
    1. getElement(int ele)
    2. putElement(ele)
 */

public class LeastFrequentElement {
    static int leastFrequent(int arr[], int n) {
        int leastCount = n + 1;
        int currentCount = 1;
        int res = -1;
        Arrays.sort(arr);

        for (int i = 1; i<n ;i++){
            if (arr[i] == arr[i-1]){
                currentCount++;
            }
            else {
                if (currentCount<leastCount){
                    leastCount = currentCount;
                    res = arr[i-1];
                }
                currentCount  = 1;
            }
        }
        if (currentCount<leastCount){
            leastCount = currentCount;
            res  = arr[n-1];
        }
        return res;

    }
    static int leastFrequent2(int arr[], int n){
        Map<Integer , Integer> count = new HashMap<>();

        for (int i=0;i<n;i++){
            int key = arr[i];
            if (count.containsKey(key)){
                int freq = count.get(key);
                freq++;
                count.put(key , freq);
            }
            else {
                count.put(key,1);
            }
        }
        int minCount = n+1, res = -1;

        for (Map.Entry<Integer , Integer> val : count.entrySet()){
            if (minCount>=val.getValue()){
                minCount = val.getValue();
                res = val.getKey();
            }
        }

        return res;
    }
    public static void main(String args[])
    {
        int arr[] = {1, 3, 2, 1, 2, 2, 3, 1,4};
        int n = arr.length;
        System.out.print(leastFrequent2(arr, n));

    }
}
