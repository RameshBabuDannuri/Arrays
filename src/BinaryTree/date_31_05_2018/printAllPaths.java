package BinaryTree.date_31_05_2018;

public class printAllPaths {
    static Node root;
   void printPaths(Node root){
        int path[] = new int[1000];
        printPathsRec(root, path , 0);
    }
  void printPathsRec(Node node , int path[] , int pathLen){
        if (node == null){
            return;
        }
        path[pathLen] = node.data;
        pathLen++;
        if (node.left == null && node.right == null){
            print(path , pathLen);
        }
        else {
            printPathsRec(node.left , path , pathLen);
            printPathsRec(node.right , path , pathLen);
        }

    }
    void  print(int path[] , int len){
      for(int  i =0 ;i<len ;i++){
          System.out.print(path[i]+" ");
      }
      System.out.println("");
    }
    public static void main(String args[])
    {
        printAllPaths tree = new printAllPaths();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);

        tree.printPaths(tree.root);
    }

}
