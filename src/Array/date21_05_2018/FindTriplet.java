package Array.date21_05_2018;

import java.util.Arrays;
import java.util.HashSet;

public class FindTriplet {
    static boolean approch1(int a[] , int n , int x){
        for (int i = 0; i<n-2 ;i++){
            for (int j = i+1 ; j<n-1 ;j++){
                for (int k = j+1;k<n ; k++){
                    if (a[i]+a[j]+a[k] == x){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean approch2(int a[], int n, int x){
        Arrays.sort(a);
            int sum = 0;
        for(int i = 0; i<n-2 ;i++){
            int left = 1;
            int right  = n-1;
            while (left<right){
                sum = a[i]+a[left]+a[right];
                if (sum == x){
                    return true;
                }
                else if (sum<x){
                    left++;
                }
                else {
                    right--;
                }
            }

        }
        return false;
    }
    static void hashApproch(int a[] , int n , int x){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i<n-1 ; i++) {
            int s1 = x-a[i];
            for (int j = i + 1; j < n; j++) {
                int s2 = s1 - a[j];
                if (set.contains(s2)) {
                    System.out.println("sum pairs are = " + a[i] + ", " +s2+" ,"+a[j]);                //return;
                }
            }
            set.add(a[i]);

        }
        System.out.println("No pair is availabe");

    }
    public static void main(String args[]){
        int a[]={10,1,2,6,8,5,3};
        System.out.println(approch1(a,a.length,20));
        System.out.println(approch2(a,a.length,28));
        hashApproch(a,a.length,20);
    }
}
