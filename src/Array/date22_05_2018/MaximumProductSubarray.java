package Array.date22_05_2018;
/*
Given an array that contains both positive and negative integers,
find the product of the maximum product subarray.
Expected Time complexity is O(n) and only O(1) extra space can be used.
 The maximum product can be positive, negative or zero.

Examples:

Input : arr[] = {-2, -3, 0, -2, -40}
Output : 80
Subarray : arr[3..4] i.e.{-2, -40}

Input : arr[] = {0, -4, 0, -2}
Output : 0
 */
public class MaximumProductSubarray {

    static void maxProduct(int a[] , int n){
        int maxproduct = 0;
        int sub_i  = 0;
        int sub_j = 0;
        int product = a[0];
        int i=0;
        int  j = 1;
        while (i<n && j<n){
            product = Math.abs(product * a[j]);
            if (Math.abs(product)>Math.abs(maxproduct)){
                maxproduct = product;
                sub_i = i;
                sub_j = j;
            }
            if (product == 0){
                i = j;
                j = i;
                product = a[i];
            }
            j++;
        }
        System.out.println("max product  is "+maxproduct);

        if (maxproduct == 0){
            return;
        }
        System.out.println("sub array is indexes =  "+sub_i +" ,"+sub_j);
        for (int k = sub_i; k <=sub_j ; k++) {
            System.out.print(a[k]+" ");
        }
    }
    public static void main(String args[]){
        int b[] = {-2,-4, 0 ,-2,-48 , 0};
        maxProduct(b,b.length);
        int a[]= {-2,0,-4,0};
        maxProduct(a,a.length);

    }
}
