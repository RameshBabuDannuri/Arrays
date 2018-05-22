package date21_05_2018;

public class BinarySearch {

    int search(int a[], int low , int high , int x){
        int mid ;
        while (low<high){
            mid= (low+high)/2 ;
        if(a[mid] == x){
            return mid;
        }
       if(a[mid]<x){
            low = mid+1;
       }
       else {
           high = mid-1;
       }
        }
       return -1;
    }
    public static void main(String args[]){
        int a[] = {1,2,3,4,5};
        BinarySearch object = new BinarySearch();
        System.out.print(object.search(a,0,a.length,10));
    }
}
