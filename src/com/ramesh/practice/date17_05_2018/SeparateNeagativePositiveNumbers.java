package com.ramesh.practice.date17_05_2018;

import java.util.Arrays;

public class SeparateNeagativePositiveNumbers {

    static void rearrange(int arr[]){
        int  n = arr.length;
        int i = -1, temp = 0;
        for (int j = 0; j < n; j++)
        {
            if (arr[j] < 0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println();
        for ( int a:arr) {
            System.out.print(a+" ");
        }

        int pos = i+1, neg = 0;

        while (pos < n && neg < pos && arr[neg] < 0)
        {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
    }
    public static void main(String args[]){
        int[] arr= {1,2,-3,4,5,-6,7,8,-9,-10};
        for ( int a:arr) {
            System.out.print(a+" ");
        }
        rearrange(arr);
        System.out.println();
        for ( int a:arr) {
            System.out.print(a+" ");
        }
    }
}
