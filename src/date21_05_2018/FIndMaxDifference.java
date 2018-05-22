package date21_05_2018;
/*
7 Find the max difference in an array
 so that the larger element has higher index than smaller element Approach-1
 */
public class FIndMaxDifference {
    static int find(int a[] , int n){
        int diff;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i<n-1;i++){
            for (int j = i+1 ; j<n ; j++){
                if (a[j]>a[i]){
                    diff = a[j] - a[i];
                    if (maxDiff<diff){
                        maxDiff = diff;
                    }
                }
            }
        }
        return maxDiff;
    }
    static void approch2(int a[], int n){
        int max_diff = a[1]-a[0];
        int min_element = a[0];
        int i;
        for (i =1; i<n ;i++){
            if (a[i]-min_element > max_diff){
                max_diff = a[i]-min_element;
            }
            if (min_element>a[i]){
                min_element = a[i];
            }
        }
        System.out.print("max diff "+max_diff);
    }
    public static void main(String args[]){
        int a[] = {101,2,7,6,10,1,13,100};
        System.out.println(find(a,a.length));
        approch2(a,a.length);

    }
}
