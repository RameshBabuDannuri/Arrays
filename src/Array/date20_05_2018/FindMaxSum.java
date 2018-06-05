package Array.date20_05_2018;

public class FindMaxSum {
    int max(int x,int y){
        return x<y ? y : x;
    }

    int maxSum(int a[], int b[] , int m, int n){

        int sum1 = 0 , sum2 = 0, result = 0;
        int i =0 , j = 0;

        while(i<m && j<n){
            if (a[i]<b[j]){
                sum1 = sum1+a[i++];
            }
            else if (a[i]>b[j]){
                sum2 = sum2+b[j++];
            }

            else {
                result = result+max(sum1,sum2);
                sum1 = 0 ;
                sum2 =0;

                while (i < m && j < n && a[i] == b[j])
                {
                    result = result + a[i++];
                    j++;
                }
            }
        }
        while (i < m)
            sum1 = sum1 + a[i++];

        while (j < n)
            sum2 = sum2 + b[j++];

        result = result+max(sum1,sum2);

        return result;
    }
    public static void main(String[] args)
    {
        FindMaxSum sum = new FindMaxSum();
        int ar1[] = {2, 3, 7, 10, 12, 15, 30, 34};
        int ar2[] = {1, 5, 7, 8, 10, 15, 16, 19};
        int m = ar1.length;
        int n = ar2.length;
        System.out.println("sum :"+sum.maxSum(ar1, ar2, m, n));
    }
}
