package Array.date17_05_201;
/*
*
 */

/*Sort the array*/
public class FindValue {
    static int find(int arr[] , int n , int k){
        for (int  i =0; i<n ; i++){
            if (arr[i] == k){
                k = k*2;
            }
        }

        return k;
    }
    public static void main(String[] args)
    {
        int arr[] = {4, 2, 3, 10, 8, 1}, k = 2;
        int n = arr.length;
        System.out.print(find(arr, n, k));
    }
}
