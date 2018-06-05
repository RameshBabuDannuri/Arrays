package BinaryTree.date_31_05_2018;

public class PrintNodesKDistance {
    static Node root;
    void printKD(Node node , int k){
        print(node , k , 1);
    }
    void print(Node node , int k , int dist)
    {
       if (node == null){
           return;
       }
       if (k == dist){
           System.out.print(node.data+" ");
       }
       print(node.left , k, dist+1);
       print(node.right , k , dist+1);
    }
    public static void main(String args[]){
        PrintNodesKDistance tree = new PrintNodesKDistance();

        root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);


        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        tree.printKD(root, 2);
    }

}


