package Array.date17_05_201;

import java.util.HashMap;
import java.util.Map;

public class FirstNonReapeatElement {

    int find(int arr[] , int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
            }
            if (j==n){
                return arr[i];
        }
        }
        return -1;
    }

    int find2(int arr[], int n){
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0 ; i<n ; i++){
            int key = arr[i];
            if (map.containsKey(key)){
                int count = map.get(key);
                count++;
                map.put(key, count);

            }
            else {
                map.put(key,1);
            }
        }
        for (Map.Entry<Integer, Integer> val : map.entrySet()){
            if (val.getValue()==1){
                return val.getKey();
            }
        }
        return -1;

    }
    public static void main(String args[]){
        FirstNonReapeatElement obj = new FirstNonReapeatElement();
        int arr[]={2,3,2,6,8,6,7,7,3};
        System.out.print(obj.find2(arr,arr.length));
    }
}
