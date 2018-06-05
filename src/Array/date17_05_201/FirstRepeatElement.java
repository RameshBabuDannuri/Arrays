package Array.date17_05_201;

import java.util.HashMap;
import java.util.Map;

/*
Look at java hashing and learn hashing actually works [watch ravindra videos]

 */
public class FirstRepeatElement {
    static int findRepeatingUsingHash(int arr[], int n){
        /*int hash[] = new int[100];
        for (int i = 0 ;i<n;i++){
            hash[arr[i]]++;
        }
        for (int i=0;i<n; i++){
            if (hash[arr[i]]>1){
                return arr[i];
            }
        }
        return -1;*/

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<n;i++){
            int key = arr[i];
            if(map.containsKey(key)){
                int repeat = map.get(key);
                repeat++;
                map.put(key,repeat);
            }
            else {
                map.put(key,1);
            }
        }
        int res = -1;
        for (Map.Entry<Integer,Integer> val: map.entrySet()){
            if (val.getValue()>1){
                res = val.getKey();
                break;
            }
        }
        return res;
    }

    static  int findRepeating(int arr[], int n){
        int sum = 0;
        for (int i = 0;i<n ;i++){
            sum = sum+arr[i];
        }
        int sum_of_n_numbers = n*(n-1)/2;
        return sum - sum_of_n_numbers;
    }
    public static void main(String[] args)
    {
        int arr[] = {10,9,3,5,7,8,8};
        int n = arr.length;
        System.out.println(findRepeatingUsingHash(arr, n));
    }
}
