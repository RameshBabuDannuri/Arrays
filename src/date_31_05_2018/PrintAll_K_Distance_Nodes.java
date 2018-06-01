package date_31_05_2018;

public class PrintAll_K_Distance_Nodes {
     Node root;
    void printKdistanceNodeDown(Node node , int k){
        if (node == null){
            return;
        }
        if (k == 0){
            System.out.println(node.data+" ");
            return;
        }
        printKdistanceNodeDown(node.left , k-1);
        printKdistanceNodeDown(node.right , k-1);
    }
    int printKdistanceNode(Node node , Node target , int k){
        if (node == null){
            return -1;
        }
        if (node == target){
            printKdistanceNodeDown(node , k);
            return 0;
        }
        int dl = printKdistanceNode(node.left , target , k);
        if (dl != -1){
            if (dl+1 == k){
                System.out.println(node.data + " ");
            }
            else {
                printKdistanceNodeDown(node.right , k-dl-2);
            }
            return dl+1;
        }
        int dr = printKdistanceNode(node.right , target , k);
        if (dr!= -1){
            if (dr+1 == k){
                System.out.println(node.data+" ");
            }
            else {
                printKdistanceNodeDown(node.left , k-dr-2);
            }
            return dr+1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        PrintAll_K_Distance_Nodes tree = new PrintAll_K_Distance_Nodes();

        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        Node target = tree.root.left.right;
        tree.printKdistanceNode(tree.root , target , 2);
    }
}
