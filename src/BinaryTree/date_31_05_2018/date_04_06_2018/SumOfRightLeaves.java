package BinaryTree.date_31_05_2018.date_04_06_2018;

public class SumOfRightLeaves {
    static Node root = null;
  static class Node{
      int data;
      Node left;
      Node right;
      Node(int data){
          this.data = data;
      }
  }
    static int rightLeafSum = 0;
  void sumOf(Node root){
      if (root!=null) {
          if (root.right!=null){
              if (root.right.left == null && root.right.right == null){
                  rightLeafSum +=root.right.data;
              }
          }
          sumOf(root.left);
          sumOf(root.right);
      }
  }
  public static void main(String args[]){
      SumOfRightLeaves tree = new SumOfRightLeaves();
      root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.left.left.right = new Node(2);
      root.right.right = new Node(10);
      tree.sumOf(root);
      System.out.println("sum of right leave " +rightLeafSum);
  }
}
