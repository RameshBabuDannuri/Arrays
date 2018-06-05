package BinaryTree.date_31_05_2018.date_26_05_2018;

public class Tree{
     static Node root = null;
     void insert(int data){
         root  = insert(root, data);
     }

    Node insert(Node root ,int data){
        if (root==null){
            root = new Node(data);
        }
        else{
           if (root.left!=null){
               root.left = insert(root.left , data);
            }
            else {
               root.right = insert(root.right , data);
           }
        }
        return root;
    }
    void inorder(Node root){
        Node current = root;
        if (current == null){
            return;
        }
        inorder(current.left);
        System.out.print(current.data+" ");
        inorder(current.right);
    }

    public static void main(String args[]){
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.inorder(root);
    }
}