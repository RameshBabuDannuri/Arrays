package Array.date21_05_2018;

public class findRightSideSmallerElements {
    static void approch1(int a[], int n){
        int count = 0;
        for (int i=0 ; i<n-1;i++){
            for (int j = i+1 ;j<n ;j++){
                if (a[i]>a[j]){
                    count++;
                }
            }
            System.out.println(a[i]+" = "+count);
            count = 0;
        }
    }
    public static void main(String args[]){
        int a[] ={10,3,4,5,7,1,3,2};
        approch1(a,a.length);
    }
}
