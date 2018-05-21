package date20_05_2018;

import static java.util.Arrays.binarySearch;

/*
An element in a sorted array can be found in O(log n) time via binary search.
But suppose we rotate an ascending order sorted array at some pivot unknown
to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2.
Devise a way to find an element in the rotated array in O(log n) time.
 */
public class SearchElementRotatedArray {
    static int find(int a[],int n ,int x){
        int pivot = findPivot(a , 0, n-1);

        if (pivot == -1)
            return binarySearch(a, 0, n-1, x);

        if(a[pivot] == x)
            return pivot;

        if (a[0] <= x)
            return binarySearch(a, 0, pivot-1, x);

        return binarySearch(a, pivot+1, n-1, x);
    }

    private static int findPivot(int[] a, int low, int high) {
       if (low>high){
           return -1;
       }
       if (low == high){
           return low;
       }
       int mid = (low+high)/2 ;
       if (mid<high && a[mid]>a[mid+1]){
           return mid;
       }
       if (mid>low && a[mid] < a[mid-1]){
           return mid-1;
       }
       if (a[low]>=a[mid]){
           return findPivot(a,low, mid-1);
       }
       return findPivot(a,mid+1,high);
    }

    public static void main(String args[])
    {
        int arr1[] = {2,3,4,5,6,7,22};
        int n = arr1.length;
        int key = 22;
        System.out.println("Index of the element is : "
                + find(arr1, n, key));
    }

}
