package date19_05_2018;
/*
 find if a given integer x appears more than n/2 times in a sorted array of n integers.
 */
public class MajorityElement {

   static  boolean check(int a[], int n , int x){
       int count = 0;
        for (int i = 0 ;i<n ; i++){
            if(a[i] == x){
                count ++;
            }
        }
        if (count>n/2){
            return true;
        }
        return false;
    }
    public static  void main(String args[]){
        int a[] = {1,2,3,3,3,3,4};
        System.out.println(check(a,a.length,3));

    }
}
