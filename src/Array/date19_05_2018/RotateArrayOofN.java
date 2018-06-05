package Array.date19_05_2018;


public class RotateArrayOofN {
    static void leftToRight(int a[], int d, int n){
        rotate(a, 0,d-1);
        rotate(a,d,n-1);
        rotate(a,0,n-1);

    }
    static void rotate(int a[], int l, int r){

        int temp;
        while (l<r){
            temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        leftToRight(a,2,a.length);
        for ( int e: a
                ) {
            System.out.print(e+", ");
        }
    }
}
