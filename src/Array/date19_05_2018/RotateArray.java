package Array.date19_05_2018;
/*
Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements
 */
public class RotateArray {

    static void rotate(int a[], int d, int n){
        int temp[] = new int[d];
        int j = 0;
        for (int i = 0 ; i<d; i++){
            temp[i] = a[i];
        }
        for (int i = d; i<n ; i++){
            a[j] = a[i];
            j++;
        }
        for (int i =0 ; i<d ;i++){
            a[j] = temp[i];
            j++;
        }
    }
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        rotate(a,2,a.length);
        for ( int e: a
             ) {
            System.out.print(e+", ");
        }
    }
}
