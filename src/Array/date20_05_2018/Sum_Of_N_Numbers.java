package Array.date20_05_2018;

public class Sum_Of_N_Numbers {
    static int sum(int n){
        int total = (n*(n+1)*(n+2)) / 6;
        return total;
    }
    public static void main (String[] args) {

        int n = 4;
        System.out.println( sum(n));

    }
}
