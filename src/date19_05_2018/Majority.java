package date19_05_2018;

import java.util.Arrays;
import java.util.HashMap;

/*
Write a function which takes an array and prints the majority element (if it exists),
 otherwise prints “No Majority Element”. A majority element in an array A[] of
  size n is an element that appears more than n/2 times
   (and hence there is at most one such element)
 */
public class Majority {
    static  void sampleApproch(int a[], int n){
        if (n<2){
            System.out.println("No Majority element");
            return;
        }
        int maxCount = Integer.MIN_VALUE;
        int count = 1;
        int MajorityElement = -1;
        for (int i = 0 ; i<n-1;i++){
            for (int j = i+1; j<n; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if (count>maxCount){
                maxCount = count;
                MajorityElement = a[i];
                count = 1;
            }
            else {
                count = 1;
            }
        }
        System.out.println("max count is ="+maxCount);
        if (maxCount > n/2){
            System.out.println("Majority Element is ="+MajorityElement);
            return;
        }
        else {
            System.out.println("No Majority element");
        }

    }
    static void sortApproch(int a[], int n){
        Arrays.sort(a);
        for (int i = 0 ; i<= n/2 ;i++){
            if (a[i] == a[i+n/2]){
                System.out.println("majority element is "+a[i]);
                return;
            }
        }
    }
    static void hashApproch(int a[] , int n){
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = 0 ;i<n; i++){
            if (map.containsKey(a[i])){
                int value = map.get(a[i]);
                  value = value+1;
                if (value>n/2){
                    System.out.println("majority element is = "+a[i]);
                    return;
                }
                else {
                  map.put(a[i], value);
                }
            }
            else {
                map.put(a[i], 1);
            }
        }
        System.out.println("No majority element");
    }
    static void bestApproch(int a[] , int n){
        int count = 1;
        int index = 0;
        for(int i = 1 ; i<n ; i++){
            if (a[index] == a[i]){
                count++;
            }
            else {
                count--;
            }
            if (count == 0){
                index = i;
                 count  = 1;
            }
        }
        int candidate = a[index];
        int majorityCount = 0;
        for (int i = 0 ; i<n ; i++){
            if (a[i] == candidate){
                majorityCount++;
            }
        }
        if (majorityCount> n/2){
            System.out.println("Majority element is "+a[index]);
        }
        else {
            System.out.println("No majority Element");
        }

    }
    public static void main(String args[]){
        int arrA[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int arrB[] = {3, 3, 4, 2, 4, 4, 2, 4};
        //sampleApproch(arrA,arrA.length);
        //sampleApproch(arrB, arrB.length);

        sortApproch(arrA, arrA.length);

        hashApproch(arrA,arrA.length);
        hashApproch(arrB,arrB.length);
        bestApproch(arrA,arrA.length);
        bestApproch(arrB,arrB.length);
    }
}
