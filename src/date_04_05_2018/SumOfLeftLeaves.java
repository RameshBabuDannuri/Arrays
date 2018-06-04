package date_04_05_2018;

public class SumOfLeftLeaves {
   static Node root = null;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
     static int leftLeavesSum = 0;

    public void SumOf(Node root){
        if (root == null){
            return;
        }
        if (root.left!=null){
            if (root.left.left == null && root.left.right == null )
            {
                leftLeavesSum += root.left.data;
            }
        }
        SumOf(root.left);
        SumOf(root.right);
    }
    public static void main(String args[]){
        SumOfLeftLeaves tree = new SumOfLeftLeaves();
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(2);
        root.right.left = new Node(10);
        tree.SumOf(root);
        System.out.println("sum of left leave " +leftLeavesSum);
    }
}
