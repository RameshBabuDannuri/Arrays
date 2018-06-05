package Array.date21_05_2018;
class Node {
    int data;
    int left_Count;
    int counter;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left_Count = 1;
        this.counter = 0;
        this.left = null;
        this.right = null;
    }
}
public class CountSmaller {

     public  static Node root  = null;

    private static void printInorder(Node node) {
        if (node == null) {
            return ;
        }
        if (node.left!=null) {
            printInorder(node.left);
        }
        System.out.println(node.data + "::" + node.counter);
        if ( node.right !=null) {
            printInorder(node.right);
        }
    }

    private static Node buildBST(Node node, int[] a) {
          if (a == null){
              return null;
          }
          int len = a.length;
          for (int  i =len-1 ; i>=0 ; i--){
              node = insertIntoBST(node , a[i] , 0);
          }
          return node;
    }
    public static Node insertIntoBST(Node node , int value , int leftSum){

          if (node == null){
              return new Node(value);
          }
          if(value <= node.data) {
              ++node.left_Count;
              node.left = insertIntoBST(node.left, value, leftSum);
              if (node.left.left == null && node.left.right == null) {
                  node.left.counter = leftSum;
              }
          }
              else {
              node.right = insertIntoBST(node.right, value, node.left_Count + leftSum);
              if (node.right.right == null && node.right.left == null) {
                  node.right.counter = node.left_Count + node.counter;
              }
          }
          return node;

    }
    public static void main(String args[]){
        int [] A = {4,12,5,6,1,34,3,2};
        root = buildBST(root, A);
        System.out.println("Printing inorder - data and count of smaller elements to the right: ");
        printInorder(root);

    }
}
