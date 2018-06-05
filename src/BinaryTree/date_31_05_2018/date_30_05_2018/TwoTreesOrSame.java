package BinaryTree.date_31_05_2018.date_30_05_2018;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TwoTreesOrSame {
    static boolean sameOrNot(Node root1 , Node root2){
        if (root1 == null && root2==null){
            return true;
        }
        if (root1==null || root2 == null){
            return false;
        }

        return root1.data == root2.data &&
                sameOrNot(root1.left , root2.left) &&
                sameOrNot(root1.right , root2.right);
    }
    static int size(Node root){
        if (root == null){
            return 0;
        }
        int l = size(root.left);
        int r = size(root.right);
        return l+r+1;
    }
    public static void main(String args[]){
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        System.out.println("Two tress are same ? "+sameOrNot(root1,root2) );
        System.out.println("tree size "+size(root1));
    }
}
