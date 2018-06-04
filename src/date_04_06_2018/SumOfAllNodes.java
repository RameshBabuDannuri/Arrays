package date_04_06_2018;

public class SumOfAllNodes {
    int sum(Node root){
        if (root == null){
            return 0;
        }
        return root.data + sum(root.left)+sum(root.right);

    }
    public static void main(String args[]){
        SumOfAllNodes tree = new SumOfAllNodes();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(3);
        System.out.println("sum of all Nodes  = "+tree.sum(root));


    }
}
