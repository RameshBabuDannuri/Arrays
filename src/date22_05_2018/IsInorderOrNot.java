package date22_05_2018;

public class IsInorderOrNot {
    boolean check(int a[]){
        int n = a.length;
        for(int i = 0 ;i<n-1 ;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8};
        IsInorderOrNot ob = new IsInorderOrNot();
        System.out.print(ob.check(a));
    }
}
