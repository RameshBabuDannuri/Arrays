package Array.date19_05_2018;
/*
Given an array of distinct integers, find length of the longest
subarray which contains numbers that can be arranged in a continuous sequence.
 */

import java.util.Arrays;

public class LongestContiguousSubSequence {

    static void find(int a[], int n){
        int count=1;
        int maxCount = Integer.MIN_VALUE;
        Arrays.sort(a);
        int startIndex = 0;
        int endIndex = n-1;
        int i;
        for (i = 1 ; i<n;i++){
            if (a[i] == a[i-1]+1){
                count++;
            }
            else {
                if (maxCount<count){
                    System.out.println("count is = "+count);
                    maxCount = count;
                    startIndex = i-count;
                    endIndex = i-1;
                    count = 1;
                }
                else {
                    count = 1;
                }
            }
        }
        if (maxCount == 1){
            System.out.println("No longest subsequence is available");
            return;
        }
        if (maxCount<count){
            maxCount = count;
            startIndex = i-count;
            endIndex = i-1;
        }
        System.out.println("Longest sub sequence length is = "+maxCount);
        for (int  j =startIndex ; j<=endIndex;j++){
            System.out.print(a[j]+" , ");
        }

    }
    public static void main(String args[]){
        int a[] = {1,3,5,7,9};
        find(a,a.length);
    }
}
