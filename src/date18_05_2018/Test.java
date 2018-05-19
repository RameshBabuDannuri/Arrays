package date18_05_2018;

/*
* Find an array element such that all elements are divisible by it
* */
public class Test {
    static int find(int arr[], int n){

        for (int i = 0 ;i<n ;i++){
            int j;
            for ( j = 0 ;j<n;j++){
                    if (arr[j] % arr[i] >= 1){
                        break;
                    }
                }
                if (j == n){
                return arr[i];
            }
        }
        return -1;
    }

    static int find2(int arr[], int n){

        int small = Integer.MAX_VALUE;
        for (int i = 0 ; i<n;i++){
            if (arr[i]<small)
            {
                small = arr[i];
            }
        }

        for (int  i = 1;i<n;i++){
            if (arr[i]%small >= 1){
              return -1;
            }
        }
        return small;
    }
    public static void main(String args[])
    {
        int a[] = { 25, 20, 5, 10, 100 };
        int n = a.length;
        System.out.println(find2(a, n));
    }
}
