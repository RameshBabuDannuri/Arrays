package date22_05_2018;

/*
Given two values k1 and k2 (where k1 < k2) and a
root pointer to a Binary Search Tree. Print all the keys of tree
in range k1 to k2. i.e. print all x such that k1<=x<=k2
and x is a key of given BST. Print all the keys in increasing order.
 */

public class PrintK1ToK2 {

    static Node root;

    void Print(Node node, int k1, int k2) {

        if (node == null) {
            return;
        }

        if (k1 < node.data) {
            Print(node.left, k1, k2);
        }

        if (k1 <= node.data && k2 >= node.data) {
            System.out.print(node.data + " ");
        }

        if (k2 > node.data) {
            Print(node.right, k1, k2);
        }
    }


    public static void main(String[] args) {
        PrintK1ToK2 tree = new PrintK1ToK2();
        int k1 = 10, k2 = 25;
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);

        tree.Print(root, k1, k2);
    }
}