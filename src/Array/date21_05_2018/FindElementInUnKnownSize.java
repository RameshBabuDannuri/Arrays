package Array.date21_05_2018;

public class FindElementInUnKnownSize {
    static int search(int a[], int low , int high , int x){
        if(high>=low){
            int mid = low+(high-1)/2;
            if (a[mid] == x){
                return mid;
            }
            if(a[mid]>x){
                return search(a,low,mid-1,x);
            }
            return search(a,mid+1,high , x);
        }
        return -1;
    }
    static int find(int arr[], int x){

        int statIndex = 0;
        int endIndex = 1;

        int val = arr[0];

        while (val<x){
            statIndex = endIndex ;
             endIndex = endIndex*2;
             val = arr[endIndex];
        }
        return search(arr,statIndex,endIndex,x);

    }
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6,7,8,9,11,22,222,2222,22222};
        int ans = find(a,3);

        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }

}
