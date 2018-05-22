package date21_05_2018;

public class KthMissingElementInSortedArray {
   static int find(int a[] , int k){
       int len = a.length;
        int missing[] = new int[a[len-1]];
           if( k > a[len-1]){
               return -1;
           }
           int  j =0;
        for (int  i = 0 ; i<a.length-1 ; i++){
            int presentNumber = a[i];
            while (presentNumber!=a[i+1]-1){
                missing[j]=presentNumber+1;
                presentNumber++;
                j++;
            }

        }
        return missing[k-1];
    }
    static int bestApproch(int a[] , int x){
       int count = x;
       int difference = 0;
       int ans = 0;
       boolean flag = false;
       for (int  i =0; i<a.length ; i++){
           difference = 0;
           if (a[i]+1 != a[i+1]){
               difference = difference+(a[i+1]-a[i])-1;
             if (difference>=count){
                 ans = a[i]+count;
                 flag = true;
                 break;
             }
             else {
                 count = count-difference;
             }

           }

       }
       if (flag == true){
           return ans;
       }
       else {
           return -1;
       }
    }
    public static void main(String args[]){
        int a[]={1,3,5,7,9};
        System.out.println(find(a,2));
        System.out.println(bestApproch(a,2));

    }
}
