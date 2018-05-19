package date19_05_2018;

import date18_05_2018.HashSetCustom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
Write a java program that, given an array A[] of n numbers and another number x,
determines whether or not there exist two elements in S whose sum is exactly x.
 */
public class FindPairSum {

    static void sampleApproch(int a[], int n , int x){
        for (int i = 0; i<n-1;i++){
            for (int j = 1 ; j<n ; j++){
                if (a[i]+a[j]== x){
                    System.out.println("sum pairs are = "+ a[i]+" , "+a[j]);
                    return;
                }
            }
        }
        System.out.println("No pair is availabe");
    }
    static void sortApproch(int a[], int n , int x){
        Arrays.sort(a);
        int l =0;
        int r = n-1;
        while (l<r){
            if (a[l]+a[r]== x){
                System.out.println("sum pairs are = "+ a[l]+" , "+a[r]);
                return;
            }
            if (a[l]+a[r]<x){
                l++;
            }
            else {
                r--;
            }
        }
        System.out.println("No pair is availabe");

    }
    static void hashApproch(int a[] , int n , int x){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i<n ; i++){
            int temp = x-a[i];
            if (set.contains(temp)){
                System.out.println("sum pairs are = "+a[i]+", "+temp);
                return;
            }
            set.add(a[i]);
        }
        System.out.println("No pair is availabe");

    }

     public static void main(String args[]){
        int a[] = {1, 4, 45, 6, 10, -8};
        sampleApproch(a,a.length,160);
        sortApproch(a,a.length,10);
        hashApproch(a,a.length,14);
     }
}
