package Array.date20_05_2018;

import java.util.Arrays;
/*
Given an array of distinct elements, rearrange the elements of
array in zig-zag fashion in O(n) time.
 The converted array should be in form a < b > c < d > e < f.
 */
public class ConvertZigZagFashion {

    public void sampleApproch(int a[], int n){
        Arrays.sort(a);

        for (int i = 1 ; i<n ; i+=2){
             int temp = a[i];
             a[i] = a[i+1];
             a[i+1] = temp;
        }

    }
    public void efficientApproch(int a[], int n) {
        for (int i = 0; i<n ; i+=2){
            if (i>0 && a[i-1]>a[i]){
                swap(a,i,i-1);
            }
            if (i<a.length-1 && a[i]<a[i+1]){
                swap(a,i,i+1);
            }
        }
    }
    private void swap(int a[] , int x, int y){
        int temp = a[x];
        a[x]  = a[y] ;
        a[y] = temp;
    }
    public static void main(String args[]){
        ConvertZigZagFashion object = new ConvertZigZagFashion();
        int a[]= {9,8,7,6,5,4,3,2,1};
        //object.sampleApproch(a,a.length);
        object.efficientApproch(a,a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ,");
        }
    }

}
