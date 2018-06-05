package Array.date19_05_2018;

import java.util.Arrays;

/*
Two elements whose sum is closest to zero
 */
public class SumClosestToZero {

    static void minSum(int a[],int n){
        int sum = 0;
        int i, j;
        int min_i = 0 , min_j = 1;
        if (n<2){
            return;
        }
        int minSum = a[min_i]+a[min_j];

        for ( i = 0; i<n-1 ; i++){
            for (j = i+1 ; j<n ; j++ ){
                sum = a[i]+a[j];
                if (Math.abs(minSum)>Math.abs(sum)){
                    minSum = sum;
                    min_i = i;
                    min_j = j;
                }
            }
        }
        System.out.println("Two element "+a[min_i]+" + " +a[min_j]+" = " +minSum);
    }
    static void minSum2(int a[],int n){
        Arrays.sort(a);
        int l = 0;
        int r = n-1;
        int minsum = Integer.MAX_VALUE;
        int min_l = 0;
        int min_r = n-1;
        if (n<2){
            return;
        }
        int sum = 0;
        while (l<r){
            sum = a[l]+a[r];
            if (Math.abs(minsum)>Math.abs(sum)){
                minsum = sum;
                min_l = l;
                min_r = r;
            }
            if (sum<0){
                l++;
            }
            else {
                r--;
            }
        }
        System.out.println("Two elements "+a[min_l] +" + "+a[min_r]+ " = "+minsum);
    }
    public static void main(String args[]){
        int arr[] = {1, 60, -10, 70, -80, 85};
           minSum2(arr, arr.length);
    }
}
