package Array.date17_05_201;

public class Space_optimization_using_bit_manipulations {

    public static void main(String[] args) {
        int a = 2, b = 10;
        int size = Math.abs(b - a) + 1;
        int array[] = new int[size];
        System.out.println(size);

        for(int i = a; i<=b ; i++){
            if(i%a == 0 || i%5 == 0){
                array[i - a] = 1;
            }
        }
        System.out.println("MULTIPLES of 2"
                + " and 5:");
        for (int i = a; i <= b; i++)
            if (array[i - a] == 1)
                System.out.printf(i + " ");
    }
}
