package BinaryTree.date_31_05_2018.date_26_05_2018;

public class HeightOfTree {
    int getHeight(Node root){
        if (root == null){
            return 0;
        }
        else{
            int lh = getHeight(root.left);
            int rh = getHeight(root.right);
            if (lh>rh){
                return lh+1;
            }
            else{
                return rh+1;
            }
        }
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

        HeightOfTree t = new HeightOfTree();
        System.out.println("Size of the Tree is : " + t.getHeight(root));
    }
}
