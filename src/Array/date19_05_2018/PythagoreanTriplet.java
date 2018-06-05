package Array.date19_05_2018;

import java.util.Arrays;

/*
Given an array of integers, write a function that returns true if there is
 a triplet (a, b, c) that satisfies a2 + b2 = c2.
 */
public class PythagoreanTriplet {
    static boolean sampleApproch(int a[], int n){
        for (int i = 0 ; i<n-2 ; i++){
            for (int j = i+1; j<n-1;j++){
                for (int k = j+1 ;k<n ; k++){
                    int x = a[i]*a[i];
                    int  y = a[j]*a[j];
                    int z = a[k]*a[k];
                    if (x==y+z || y==x+z || z==x+y){
                      return true;
                    }

                }
            }
        }
        return false;
    }
    static boolean sortApproch(int a[], int n){
        Arrays.sort(a);
        for (int i = n-1 ; i>=2 ; i--){
            int l = 0 ;
            int r = i-1;
            while (l<r){
                if (a[l]*a[l] + a[r]*a[r] == a[i]*a[i]){
                    return true;
                }
                if (a[l]*a[l] + a[r]*a[r] < a[i]*a[i]){
                    l++;
                }
                else {
                    r--;
                }
            }

        }
        return false;
    }
    public static void main(String args[]){
     int a[] = {3,1,4,7,8};
     System.out.println(sampleApproch(a,a.length));
        System.out.println(sortApproch(a,a.length));

    }
}
