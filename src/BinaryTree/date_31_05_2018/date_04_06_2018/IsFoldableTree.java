package BinaryTree.date_31_05_2018.date_04_06_2018;

public class IsFoldableTree {
   boolean isFoldable(Node root){
       if (root == null){
           return true;
       }
       return Foldable(root.left , root.right);
   }
   boolean Foldable(Node r1, Node r2){
       if (r1 == null && r2 == null){
           return true;
       }
       if (r1 == null || r2 == null){
           return false;
       }
       return Foldable(r1.left , r2.right) && Foldable(r1.right , r2.left);
   }
   public static void main(String args[]){
       IsFoldableTree tree = new IsFoldableTree();
       Node root = new Node(10);
       root.left = new Node(7);
       root.right = new Node(15);
       root.left.right = new Node(9);
       root.right.left = new Node(11);
       System.out.println(tree.isFoldable(root));

       Node root1 = new Node(10);
       root1.left = new Node(7);
       root1.right = new Node(15);
       root1.left.right = new Node(9);
       root1.right.right = new Node(11);
       System.out.println(tree.isFoldable(root1));
   }
}
