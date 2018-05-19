package date19_05_2018;

public class MergeArrays {

   static void moveToEnd(int mPlusN[], int n){
        int j =n-1;
        for (int i = n-1 ; i>=0 ; i--){
            if (mPlusN[i]!= -1){
                mPlusN[j] = mPlusN[i];
                j--;
            }
        }
    }
    static void merge(int mPlusN[], int N[] , int mn, int n){
        int  i = n;
        int  j = 0;
        int k = 0;
        while (k<mn && j<n ){
            if (i< mn && mPlusN[i] <= N[j]){
                mPlusN[k] = mPlusN[i];
                k++;
                i++;
            }
            else {
                mPlusN[k] = N[j];
                k++;
                j++;
            }
        }

    }

    public static void main(String args[]){
        int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 30};
        int N[] = {5, 5,5,5};
        moveToEnd(mPlusN,mPlusN.length);

        merge(mPlusN , N,mPlusN.length, N.length);
        for (int e: mPlusN){
            System.out.print(e+" ,  ");
        }

    }
}
