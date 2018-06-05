package Array.date20_05_2018;

/*
Given an array arr[], find the maximum j – i such that arr[j] > arr[i].
 */
public class FindMaximumJ_I {
    //O(n*n)
    static void MaxDifference(int a[] , int n){
        int maxDiff =-1;
        int diff = 0;
        int min_i = -1;
        int min_j = -1;
        for (int i = 0 ;i<n-1 ; i++){
            for (int j = i+1 ; j<n ; j++){
                if (a[j]>a[i]){
                    diff = j-i;
                    if (maxDiff<diff){
                        maxDiff = diff;
                        min_i = i;
                        min_j = j;
                    }
                }
            }
        }
        System.out.println("maximum difference is: "+maxDiff +" ,i = "+min_i+", j="+min_j);
    }
    //O(n) O(n) space complexity
    static int bestApproch(int a[] , int n){
        int i , j;
        int Lmin[] = new int[n];
        int Rmax[] = new int[n];
        Lmin[0] = a[0];

        for (i  =1 ; i<n ; i++){
            Lmin[i] = min(a[i] , Lmin[i-1]);
        }
        Rmax[n-1] = a[n-1];
        for (j = n-2 ; j>=0 ; j--){
            Rmax[j] = max(a[j] , Rmax[j+1]);
        }
        i =0 ; j = 0;
        int maxDiff = -1;
        while (i<n && j<n){
            if (Lmin[i]<Rmax[j]){
                maxDiff = max(maxDiff , j-i);
                j = j+1;
            }
            else {
                i = i+1;
            }
        }
        return maxDiff;

    }


    static int max(int x, int y)
    {
        return x > y ? x : y;
    }

    static int min(int x, int y)
    {
        return x < y ? x : y;
    }

    public static void main(String args[]){
        int a[] = {4,3,10,2,9,1,6};
        MaxDifference(a,a.length);
        int b[] = {1, 2, 3,4,5,6,7};
        MaxDifference(b,b.length);
        int c[] = {6,5,4,3,2,1};
       System.out.println( bestApproch(a,a.length));

    }
}
