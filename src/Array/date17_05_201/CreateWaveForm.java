package Array.date17_05_201;

import java.util.Arrays;

public class CreateWaveForm {
    void sortInWaveIN_Order_Of_N_Log_N_TC(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i<n-1;i+=2){
            swap(arr,i,i+1);
        }

    }
    void sortInWaveIN_Order_Of_N_TC(int arr[]){
        int  n = arr.length;

        for(int i = 0; i< n;i+=2 ){
            if(i>0 && arr[i-1]>arr[i]){
                swap(arr, i-1, i);
            }
            if(i<n-1 && arr[i] < arr[i+1]){
                swap(arr , i ,i+1);
            }
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String args[]){
        CreateWaveForm obj = new CreateWaveForm();
        int[] arr = {10,90,49,2,1,5,23};
        obj.sortInWaveIN_Order_Of_N_Log_N_TC(arr);
        for (int a:arr ) {
            System.out.print(a+" ");
        }
    }
}
