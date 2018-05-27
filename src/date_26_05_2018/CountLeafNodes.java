package date_26_05_2018;

public class CountLeafNodes {
    int getCount(Node node){
        Node temp = node;
        if (temp == null){
            return 0;
        }
        if(temp.left==null && temp.right == null){
            return 1;
        }
        else {
            return getCount(temp.left) + getCount(temp.right);
        }
    }
    public static void main(String args[])
    {
        CountLeafNodes tree = new CountLeafNodes();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("The leaf count of binary tree is : "
                + tree.getCount(root));
    }

}
