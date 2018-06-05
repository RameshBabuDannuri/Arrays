package BinaryTree.date_31_05_2018.date_30_05_2018;

public class PrintCommonNodes {
   static Node root;
    static void commonNodes(Node root , int n1, int n2){
        Node lca = LCA(root, n1,n2);
        printAncestors(root , lca.data);
    }
    static Node LCA(Node node , int n1, int n2){
        if (node == null){
            return node;
        }
        if (node.data == n1 || node.data==n2 ){
            return node;
        }
        Node left = LCA(node.left , n1 , n2);
        Node right = LCA(node.right ,n1,n2);
        if (left != null && right != null){
            return node;
        }
        return left!=null?left:right;
    }
    static boolean printAncestors(Node node , int target){
        if (node == null){
            return false;
        }
        if (node.data == target){
           System.out.print(node.data+ " ");
            return true;
        }
        if (printAncestors(node.left ,target) || printAncestors(node.right ,target)){
           System.out.print(node.data+" ");
            return true;
        }
        return false;
    }
    public static void main(String args[]){

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.right.left.left = new Node(9);
        root.right.left.right = new Node(10);
        System.out.println("LCA "+LCA(root,9,7).data );
        commonNodes(root,9,7);
    }
}
