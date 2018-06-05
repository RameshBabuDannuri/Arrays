package BinaryTree.date_31_05_2018.date_03_06_2018;

public class FindPairRootSum {
    void findPair(Node root,int target)
    {
        if (root!=null) {
            Node l = root.left;
            Node r = root.right;
            if ( l!=null && r!=null )
                if(Math.abs(l.data + r.data) == target) {
                System.out.println("(" + l.data + " , " + r.data + ")");
            }
            findPair(root.left, target);
            findPair(root.right, target);
        }
    }
    public static void main(String args[]){
        Node root = new Node (5);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(1);
        root.right.right = new Node(-6);
        FindPairRootSum tree = new FindPairRootSum();
        tree.findPair(root,root.data);

    }
}
