package BinaryTree.date_31_05_2018.date_03_06_2018;

public class ModifiedTree {
    static Node root;
    Node updateTree(Node node , int sum)
    {
        if (node == null){
            return null;
        }
        node.left = updateTree(node.left , sum-node.data);
        node.right =updateTree(node.right , sum-node.data);
        if (node.left == null && node.right == null){
            if (node.data < sum){
                node = null;
            }
        }

        return node;
    }
    public void print(Node root) {

        if (root == null)
            return;

        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }
    public static void main(String rgs[]){
        ModifiedTree tree = new ModifiedTree();
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(12);
        root.right.right.left = new Node(10);
        root.right.right.left.right = new Node(11);
        root.left.left.right.left = new Node(13);
        root.left.left.right.right = new Node(14);
        root.left.left.right.right.left = new Node(15);

        System.out.println("Tree before update");
        tree.print(root);

        tree.updateTree(tree.root, 45);

        System.out.println("\nTree after update");
        tree.print(root);
    }
}
