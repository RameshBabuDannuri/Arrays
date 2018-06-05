package BinaryTree.date_31_05_2018.date_03_06_2018;

public class MaxPathSumRootToLeaf {
    static Node root;
    static int sum;
    int maxPath(Node node){
        if (node ==null){
            return 0;
        }
        if (node.left == null && node.right == null){
            return node.data;
        }
        int ls = maxPath(node.left);
        int rs = maxPath(node.right);
        if (node.left!=null && node.right!=null){

            sum = Math.max(sum , ls+rs+node.data);

            return Math.max(ls,rs)+node.data;
        }
        return node.left==null ? rs+node.data : ls+node.data;
    }
    public static void main(String args[])
    {
        MaxPathSumRootToLeaf tree = new MaxPathSumRootToLeaf();
        root = new Node(-15);
        root.left = new Node(5);
        root.right = new Node(6);
        root.left.left = new Node(-8);
        root.left.right = new Node(1);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(6);
        root.right.left = new Node(3);
        root.right.right = new Node(9);
        root.right.right.right = new Node(0);
        root.right.right.right.left = new Node(4);
        root.right.right.right.right = new Node(-1);
        root.right.right.right.right.left = new Node(10);
        System.out.println("Max pathSum of the given binary tree is "
                + tree.maxPath(root));
    }
}
