package date_26_05_2018;

public class TreeIdenticalOrNot {
    boolean identicalOrNot(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 != null && node2 != null) {
            return (
                    node1.data == node2.data &&
                            identicalOrNot(node1.left, node2.left) &&
                            identicalOrNot(node1.right, node2.right));
        }
        return false;
    }

    public static void main(String args[]) {
        Node root1 = new Node(5);
        root1.left = new Node(15);
        root1.right = new Node(25);
        root1.left.left = new Node(20);
        root1.left.right = new Node(30);
        root1.right.left = new Node(2);
        root1.right.right = new Node(10);
        root1.right.left.right = new Node(22);

        Node root2 = new Node(5);
        root2.left = new Node(15);
        root2.right = new Node(25);
        root2.left.left = new Node(20);
        root2.left.right = new Node(30);
        root2.right.left = new Node(2);
        root2.right.right = new Node(10);
        root2.right.left.right = new Node(22);

        TreeIdenticalOrNot tree = new TreeIdenticalOrNot();

        System.out.print(tree.identicalOrNot(root1 , root2));

    }
}