package Array.date19_05_2018;

/*
Given a sorted array and a number x, find the pair in array whose sum is closest to x
 */
public class FindClosestSumPair {
    static void find(int a[], int n , int x){
        int minDiff = Integer.MAX_VALUE;
        int min_l = 0;
        int min_r  = n-1;
        int l = 0;
        int r = n-1;

        while (l<r){
            int diff = a[l]+a[r] - x;

            if (Math.abs(minDiff)>Math.abs(diff)){
                minDiff = diff;
                min_l = l;
                min_r = r;
            }
            if (a[l]+a[r]<x){
                l++;
            }
            else {
                r--;
            }
        }
        System.out.println(x+" closest pair is "+a[min_l]+" ,"+ a[min_r]);
    }
    public static void main(String args[]){
        int a[] = { 10, 22, 28, 29, 30, 40}, x = 54;
        int n = a.length;
        find(a,n,x);
    }
}
