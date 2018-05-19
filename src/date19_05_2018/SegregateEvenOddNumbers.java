package date19_05_2018;
/*
   All the even numbers should be present first, and then the odd numbers.
 */
public class SegregateEvenOddNumbers {

    static void segregate(int[] a, int n){
        int start = 0 ; int end = n-1;

        while (start<end){
            while (a[start]%2 == 0 && start<end){
                start++;
            }
            while (a[end]%2==1 && start<end){
                end--;
            }
            if(start < end){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        segregate(arr,n);
        for (int e: arr) {
            System.out.print(e+" ");

        }
    }
}
