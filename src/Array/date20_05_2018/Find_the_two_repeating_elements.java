package Array.date20_05_2018;

import java.util.Arrays;
import java.util.HashSet;

public class Find_the_two_repeating_elements {

    //O(n*n) Time Complexity O(1) space complexity
    static void sampleApproch(int a[], int n){
        for (int i = 0 ;i<n-1;i++){
            for (int j = i+1; j <n ; j++) {
                if (a[i] == a[j]){
                    System.out.print(a[i]+" ,");
                }
            }
        }
    }
    //O(nlogn) tc and O(1)
    static void SortApproch(int a[] , int n){
        Arrays.sort(a);
        for (int i = 0 ; i<n-1 ;i++){
            if (a[i] == a[i+1]){
                System.out.println(a[i]+" , ");
            }
        }
    }
    //O(n) tc and O(n) sc
    static void Hashing(int a[] , int n){
        HashSet<Integer> set = new HashSet<>();
        for (int  i =0; i<n ;i++){
            if (set.contains(a[i])){
                System.out.println(a[i]+", ");
            }
            set.add(a[i]);
        }
    }

    // O(n) O(1)
    static void bestApproch(int a[] , int n){
        for (int i=0 ;i<n;i++){
            if (a[Math.abs(a[i])] > 0){
                a[Math.abs(a[i])] = -a[Math.abs(a[i])];
            }
            else {
                System.out.print(Math.abs(a[i])+ " , ");
            }
        }
    }
    public static void main(String args[]){
        int a[] = {4,3,2,4,5,2,6,1,1};
       // sampleApproch(a,a.length);
        //SortApproch(a,a.length);
     // Hashing(a,a.length);
        bestApproch(a,a.length);
    }


}
