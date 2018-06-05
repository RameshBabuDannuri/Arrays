package Array.date21_05_2018;

public class FIndEquilibrium {
    int approch1(int a[], int n){
        int totalSum = 0;
        int half = 0;
        for (int i = 0 ;i<n ;i++){
            totalSum = totalSum+a[i];
        }

        for (int i = 0 ; i<n ; i++){
            totalSum= totalSum- a[i];

            if (half == totalSum){
                return i;
            }
            half = half+a[i];
        }
        return -1;
    }
    public static void main(String args[]){
        int a[] = {10,5,15,1,3,4,21,2};
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};

        FIndEquilibrium ob = new FIndEquilibrium();

        System.out.println("Equilibrium index is "+ob.approch1(a, a.length));
        System.out.println("Equilibrium index is "+ob.approch1(arr, arr.length));

    }
}
