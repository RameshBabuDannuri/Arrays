package Array.date20_05_2018;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;

public class FindFourElementsSum {
   static boolean find(int a[], int n, int x){
        for (int i = 0; i < n-3; i++) {
            for (int j = i+1; j <n-2 ; j++) {
                for (int k = j+1; k <n-1 ; k++) {
                    for (int l = k+1; l < n ; l++) {
                        int sum = a[i]+a[j]+a[k]+a[l];
                        if(sum==x){
                            System.out.println(a[i]+"+"+a[j]+"+"+a[k]
                                    +"+"+a[l]+" = "+x);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    static boolean bestApproch(int a[],int n, int x){
        Arrays.sort(a);
        int left;
        int right;
        for (int i =0 ; i<n-3;i++){
            for (int j = i+1; j <n-2 ; j++) {
                left = j+1;
                right  = n-1;
                 while (left<right){
                     if (a[i]+a[j]+a[left]+a[right] == x){
                         System.out.println(a[i]+"+"+a[j]+"+"+a[left]
                                 +"+"+a[right]+" = "+x);
                         return true;

                     }
                     else if (a[i]+a[j]+a[left]+a[right] < x){
                         left++;
                     }
                     else {
                         right--;
                     }

                 }
            }
        }
        return false;
    }
    static boolean usingHashApproch(int a[], int n , int x){
        HashMap<Integer, Point> map = new HashMap<>();
        for (int i = 0 ; i<n;i++){
            for (int j = i+1 ; j<n ; j++){
                int rest = x-a[i]-a[j];

                if (map.containsKey(rest)){
                    Point point = map.get(rest);
                    System.out.println(" elements : " + a[i] + " " + a[j] + " " + a[point.x] + " " + a[point.y]);
                    return true;
                }

            }
            for (int k = 0; k < i; k++) {
                map.put(a[i] + a[k], new Point(i, k));
            }

        }

        return false;
    }
    public static void main(String args[]){
        int a[] = {1,2,3,8,6,5,7};
        int x = 23;
        System.out.println(find(a,a.length,x));
        System.out.println(bestApproch(a,a.length,x));
        System.out.println(usingHashApproch(a,a.length,x));

    }
}
