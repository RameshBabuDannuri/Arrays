package date18_05_2018;

public class Test2 {
    static int method(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
              return -1;
            }
            if (i == 0){
                sum = sum+arr[i];
            }
            else {
                sum = sum+arr[i]/arr[i-1];
            }
        }
        return sum;
    }
    public static void main (String[] args)
    {
        int arr[] = { 2,3,4,5,6,7,8};
        int n = arr.length;
        System.out.println( method(arr, n));

    }
}
