package BinaryTree.date_31_05_2018.date_03_06_2018;
/*
Sum of nodes on the longest path from root to leaf node
 */
public class SumOfNodesOnLongestPath {
    static Node root;
    static int maxLen;
    static int maxSum;
   static int sumOfPath(Node root){
       if (root == null){
           return 0;
       }
       maxLen = 0;
       maxSum = Integer.MIN_VALUE;
       sum(root,0,0);
       return maxSum;
   }
  static void sum(Node root, int sum , int len)
   {
       if (root == null){
           if (maxLen<len){
               maxLen = len;
               maxSum =sum;
           }
           else if (maxLen == len && maxSum<sum){
               maxSum = sum;
           }
           return;
       }
       sum(root.left , sum+root.data, len+1);
       sum(root.right , sum+root.data , len+1);
   }
   public static void main(String args[]){

    root = new Node(4);         /*             4        */
    root.left = new Node(2);         /*       / \       */
    root.right = new Node(5);        /*      2   5      */
    root.left.left = new Node(7);    /*     / \ / \     */
    root.left.right = new Node(1);   /*    7  1 2  3    */
    root.right.left = new Node(2);   /*      /          */
    root.right.right = new Node(3);  /*     1           */
    root.left.right.left = new Node(1);

        System.out.println( "Sum = "+ sumOfPath(root)+" Len = "+maxLen);
   }
}
