package BinaryTree.date_31_05_2018.date_03_06_2018;
/*
Find sum of all nodes of the given perfect binary tree
Input : L = 3
Output : 30
Explanation : Tree will be - 10
                            /   \
                           3     7
                          /  \  /  \
                         1   2  3   4

Input : L = 2
Output : 6
Explanation : Tree will be -  3
                            /   \
                           1     2
 */

public class FIndSum {
    double sum(int l){
        double LeafNodesCount = Math.pow(2,l-1);
        double sumOfLastLevel = (LeafNodesCount * (LeafNodesCount+1)) / 2;
        double x = sumOfLastLevel * l;
        return x;
    }
    public static void main(String args[]){
        FIndSum obj = new FIndSum();
        System.out.println("level 2 : "+obj.sum(2));
        System.out.println("level 3 : "+obj.sum(3));
    }
}
