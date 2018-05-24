package date22_05_2018;
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
public class BinarySearchTree {

    static Node root = null;

    public void insert(int data){
        Node newNode = new Node(data);
        if (root == null){
            root = newNode ;
            return;
        }
        Node current = root;
        Node parent = null;
        while (true){

            parent = current;

            if (data<current.data){
                current  = current.left;
                if (current == null){
                    parent.left = newNode;
                    return;
                }
            }
            else {
                current = current.right;
                if (current == null){
                    parent.right = newNode;
                    return;
                }
            }

        }
    }

    public Node deleteNonRec(int key){
        Node parent = null;
        Node current = root;

        while (current!=null && current.data!=key ){
            parent = current;

            if (key<current.data){
                current = current.left;
            }
            else {
                current = current.right;
            }
        }
        //if key is not found in the tree
        if (current == null){
            return root;
        }

        //case 1: node to be deleted has no children
        if (current.left == null && current.right == null){
            if (current!=root){
                if (parent.left == current){
                    parent.left = null;
                }
                else {
                    parent.right = null;
                }
            }
            else {
                root = null;
            }
        }
        //case 2: node to be deleted has two children
        else if (current.left!=null && current.right!=null){
            Node successor = minimumKey(current.right);
            int val = successor.data;
            deleteNonRec(successor.data);
            current.data = val;
        }

        //case 3:  node to be deleted has Only one child
        else {
            Node child = (current.left!=null) ? current.left : current.right;
             if (current!=root){
                 if (current == parent.left){
                     parent.left = child;
                 }
                 else {
                     parent.right = child;
                 }
             }
             else {
                 root = child;
             }

        }
        return root;

    }
    public Node DeleteRec(Node root  ,int data){
        if (root == null){
            return root;
        }
        if(data<root.data){
            root.left = DeleteRec(root.left , data);
        }
        else if (data>root.data){
            root.right = DeleteRec(root.right,data);
        }
        else {
            if (root.left == null ){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            Node temp = minimumKey(root.right);
            root.data = temp.data;
            root.right = DeleteRec(root.right , temp.data);

        }
        return root;
    }

    private Node minimumKey(Node current) {
        if (current.left!=null){
            current = current.left;
        }
        return current;
    }
    public void inorder(Node root){
        if (root == null){
            return;
        }
         inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public boolean find(int data){
        if (root == null){
            return false;
        }
        Node temp = root;
        while (temp!=null){
            if (temp.data == data){
                return true;
            }
            if (temp.data<data){
                temp = temp.right;
            }
            else {
                temp = temp.left;
            }
        }
        return false;

    }
    int minimumValue(Node root){
        Node current = root;
        if (root == null){
            return -1;
        }
        while (current.left!=null){
            current = current.left;
        }
        return current.data;
    }
    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(10);
        tree.insert(4);
        tree.insert(12);
        tree.inorder(root);
        tree.deleteNonRec(10);
        tree.inorder(root);
        tree.DeleteRec(root,5);
        tree.inorder(root);
        System.out.print(tree.find(1));

    }

}
