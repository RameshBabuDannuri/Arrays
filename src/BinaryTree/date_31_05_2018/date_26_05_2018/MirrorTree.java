package BinaryTree.date_31_05_2018.date_26_05_2018;

public class MirrorTree {
    Node mirror(Node node) {
        if (node == null) {
            return node;
        }
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        node.left = right;
        node.right = left;

        return node;
    }

    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public static void main(String args[]) {
        Node root = new Node(5);
        root.left = new Node(15);
        root.right = new Node(25);
        root.left.left = new Node(20);
        root.left.right = new Node(30);
        root.right.left = new Node(2);
        root.right.right = new Node(10);
        root.right.left.right = new Node(22);

        MirrorTree tree = new MirrorTree();

        System.out.println("Inorder traversal of input tree is :");
        tree.inorder(root);
        System.out.println("");

        tree.mirror(root);

        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : ");
        tree.inorder(root);
    }
}
