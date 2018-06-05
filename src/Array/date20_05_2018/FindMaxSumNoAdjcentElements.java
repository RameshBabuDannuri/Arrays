package Array.date20_05_2018;
/*
Given an array of positive numbers, find the maximum sum of a
subsequence with the constraint that no 2 numbers in the sequence
 should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10)
  or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).
  Answer the question in most efficient way.
 */
public class FindMaxSumNoAdjcentElements {
   static int sampleApproch(int a[], int n){
        int sum1 = 0;
        int sum2 = 0;
        int i = 0 , j=1;
        while(i<n){
            sum1 = sum1+a[i];
            i = i+2;
        }
        while( j < n){
            sum2 = sum2+a[j];
            j = j+2;
        }
        return sum1>sum2?sum1:sum2;

    }
    public static void main(String args[]){
        int a[] = {5, 5, 10, 100, 10, 5};
        System.out.println(sampleApproch(a,a.length));
        int b[] = {1,100,100,1};
        System.out.println(sampleApproch(b,b.length));
        int c[] = {5,  5, 10, 40, 50, 35};
        System.out.println(sampleApproch(c,c.length));
    }
}
