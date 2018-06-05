package BinaryTree.date_31_05_2018.date_26_05_2018;

public class SizeOfTree {
    public int getSize(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + getSize(root.left) + getSize(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(5);
        root.left = new Node(15);
        root.right = new Node(25);
        root.left.left = new Node(20);
        root.left.right = new Node(30);
        root.right.left = new Node(2);
        root.right.right = new Node(10);

        SizeOfTree t = new SizeOfTree();
        System.out.println("Size of the Tree is : " + t.getSize(root));
    }
}