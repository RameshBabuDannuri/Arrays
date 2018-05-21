package date20_05_2018;

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

    public static void main(String args[]){
        int a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        MaxDifference(a,a.length);
        int b[] = {1, 2, 3,4,5,6,7};
        MaxDifference(b,b.length);
        int c[] = {6,5,4,3,2,1};
        MaxDifference(c,c.length);

    }
}
