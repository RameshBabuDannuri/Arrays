package Array.date21_05_2018;

import java.util.Arrays;
import java.util.HashMap;

public class Find_Number_Occuring_Odd_Number_of_times {
    static int aproch1(int a[] , int n){
        int count = 0;
        for (int  i = 0 ;i< n; i++){
            for (int j = 0 ; j<n ; j++){
                if (a[i] == a[j]){
                    count++;
                }
            }
            if (count%2 == 0){
                count = 0;
            }
            else {
                return a[i];
            }
        }
        return -1;
    }
    static int sortingApproch(int a[] , int n){
        Arrays.sort(a);
        int count=1;
        for (int i = 1 ; i<n-1 ; i++ ){
                if (a[i-1] == a[i]){
                    count++;
                }
            if (count%2 == 0){
                count  = 1;
            }
            else {
                return a[i-1];
            }
        }
        return -1;
    }
    static int HashApproch(int a[] , int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n ; i++) {
            if (map.containsKey(a[i])){
                int count = map.get(a[i]);
                count++;
                map.put(a[i], count);
            }
            else {
                map.put(a[i],1);
            }
        }
        for (Integer m:map.keySet()) {
            if (map.get(m)%2 != 0){
                return m;
            }
        }
        return -1;
    }
    static int XOR(int a[] , int n){
        int res = 0;
        for (int  i = 0 ;i<n; i++){
            res = res^a[i];
        }
        return res;
    }
    public static void main(String arg[]){
        int a[] = {3,2,1,3,2,1,1,1,2,1,2};
        System.out.println(aproch1(a,a.length));
        System.out.println(sortingApproch(a,a.length));
        System.out.println(HashApproch(a,a.length));
        System.out.println(XOR(a,a.length));


    }
}
