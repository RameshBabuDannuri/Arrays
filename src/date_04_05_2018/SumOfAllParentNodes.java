package date_04_05_2018;
/*
Given a binary tree containing n nodes. The problem is to
find the sum of all the parent node’s which have a child node with value x.
 */

public class SumOfAllParentNodes{
    Node root;
  static  int AllSum = 0;

    void  sumOfParantsOfX(Node node , int x){
        if (node != null) {
            if ((node.left != null && node.left.data == x)
                    || (node.right != null && node.right.data == x)) {
                AllSum = AllSum + node.data;
            }
            sumOfParantsOfX(node.left, x);
            sumOfParantsOfX(node.right,  x);
        }

    }
    public static void main(String ars[]){
        SumOfAllParentNodes tree = new SumOfAllParentNodes();

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(7);
        root.left.right = new Node(2);
        root.right.left = new Node(2);
        root.right.right = new Node(8);
        int x = 2;
        tree.sumOfParantsOfX(root,x);
       System.out.println(AllSum);

    }
}
