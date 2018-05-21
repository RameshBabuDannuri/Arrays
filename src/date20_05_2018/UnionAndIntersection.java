package date20_05_2018;

import java.util.HashSet;
import java.util.Iterator;

public class UnionAndIntersection {

    void UnionIntersection(int a[] , int b[] , int m,int n ){

        HashSet<Integer> union = new HashSet<>();

        for (int i = 0 ; i< m ; i++){
             union.add(a[i]);
        }
        System.out.print("Intersection :");

        for (int i = 0; i<n ;i++){
            if (union.contains(b[i])){
                System.out.print(b[i]+" ,");
            }
            union.add(b[i]);
        }
        System.out.println();

        Iterator iterator = union.iterator();
        System.out.print("Union : ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+", ");;
        }



    }
    public static void main(String args[]){
        UnionAndIntersection object = new UnionAndIntersection();
        int a[] = {1,4,3,6,9,7,2};
        int b[] = {6,5,9,8};
        object.UnionIntersection(a,b,a.length,b.length);
    }
}
