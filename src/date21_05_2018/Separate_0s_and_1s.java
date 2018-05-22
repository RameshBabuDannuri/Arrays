package date21_05_2018;

public class Separate_0s_and_1s {
   static void approch1(int a[] ,  int n){
        int  l = 0;
        int r = n-1;
        while (l<r){
            if (a[l]!=0 && a[r]!=1){
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
            if (a[l]==0){
                l++;
            }
            if (a[r] == 1){
                r--;
            }
        }
    }
    static void approch2(int a[] , int n){
       int count = 0;
       for (int i = 0 ; i<n ;i++){
           if (a[i] == 0){
               count++;
           }
       }
       for (int i =0; i<count ; i++){
           a[i] = 0;
       }
       for (int i =count ; i<n ;i++){
           a[i] = 1;
       }
    }
    public static void main(String args[]){
       int a[] = {1,0,1,0,1,0,1,0,1};
       approch2(a,a.length);
        for (int e:a ) {
            System.out.print(e+" ,");
        }
    }
}
