package com.ramesh.practice.date17_05_2018;

import java.util.Arrays;

public class Difference_between_groups_of_size_two {

    static int calculate(int arr[], int n){
        int min, max;
        Arrays.sort(arr);
         min = arr[0]+arr[1];
         max = arr[n-2]+arr[n-1];
         return max-min;
    }
    public static void main(String args[]){
        int a[] = {2,4,1,6,9,8,3,5};
        System.out.print(calculate(a,a.length));
    }
}
