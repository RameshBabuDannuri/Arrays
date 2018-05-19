package com.ramesh.practice.date17_05_2018;

public class SepatareEvenAndOddNumbers {
    static void separate_Order_Of_N(int arr[] , int n){
        int left =  0 , right = n-1;
        while (left < right){
            while (arr[left]%2 == 0 && left < right){
                left ++;
            }
            while (arr[right]%2 == 1 && left <right){
                right--;
            }
            if(left < right){
                int temp = arr[left] ;
                 arr[left] = arr[right];
                 arr[right] = temp;
                 left++;
                 right--;
            }
        }
    }
    static void separate_Order_Of_N_TC_And_SC(int arr[], int n){
        int result[] = new int[n];
        int start = 0, end = n-1, i, j;
        for( i = 0 , j = n-1 ; i< j ; i++ , j--){
            if(arr[i] % 2 == 0) {
                result[start] = arr[i];
                start++;
            }
            else{
                result[end] = arr[i];
                end--;
            }
            if(arr[j]%2 == 0 ){
                result[start] = arr[j];
                start++;
            }
            else {
                result[end] = arr[j];
                end--;
            }
        }
        result[i] = arr[i];
        for (int e:result
             ) {
            System.out.print(e+" ");

        }
    }
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        separate_Order_Of_N(arr,n);
        for (int e: arr
                ) {
            System.out.print(e+" ");

        }
    }
}
