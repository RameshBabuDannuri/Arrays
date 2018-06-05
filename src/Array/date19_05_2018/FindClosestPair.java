package Array.date19_05_2018;
/*
Given two sorted arrays and a number x, find the pair whose sum is closest to
x and the pair has an element from each array.
 */
public class FindClosestPair {
    static void findPair(int a[], int b[], int x){
        int l = 0;
        int r = b.length-1;
        int min_l = l;
        int min_r = r;
        int minDiff  = Integer.MAX_VALUE;
        while (l<a.length && r>=0){
            int diff = a[l]+b[r] - x;
            if (Math.abs(diff)<Math.abs(minDiff)){
                minDiff = diff;
                min_l= l;
                min_r =r;
            }
            if (a[l]+b[r]<x){
                l++;
            }
            else {
                r--;
            }
        }
        System.out.println(x+" closest pair is  "+a[min_l]+" ," +b[min_r]);
    }
    public static void main(String args[])
    {
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
        int x = 38;
        findPair(ar1, ar2, x);
         x = 32;
        findPair(ar1, ar2, x);
         x = 18;
        findPair(ar1, ar2, x);

    }
}
