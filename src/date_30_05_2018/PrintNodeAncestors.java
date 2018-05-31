package date_30_05_2018;

public class PrintNodeAncestors {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    static boolean printAncestors(Node root , int data){
        if (root == null){
            return false;
        }
        if (root.data == data){
            return true;
        }

        if (printAncestors(root.left,data) || printAncestors(root.right , data)){
            System.out.print(root.data+" ");
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        //root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);

        printAncestors(root, 7);

    }
}
