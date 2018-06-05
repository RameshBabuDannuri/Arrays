package BinaryTree.date_31_05_2018.date_30_05_2018;


public class FindLCA {

    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int item)
        {
            data = item;
            left = null;
            right = null;
        }
    }
    static Node root;

    Node findLca(Node node , int n1, int n2){
        if (node == null){
            return null;
        }
        if (node.data == n1 || node.data == n2){
            return node;
        }

        Node Llca = findLca(node.left, n1,n2);
        Node Rlca = findLca(node.right , n1,n2);

        if (Llca!=null && Rlca!=null){
            return node;
        }
        if (Llca == null && Rlca == null){
            return null;
        }

        return (Llca!=null)? Llca : Rlca;

    }
    public static void main(String args[]){
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        FindLCA tree = new FindLCA();
        System.out.println("LCA(4, 5) = " +
                tree.findLca(root,4, 5).data);
        System.out.println("LCA(14, 16) = " +
                tree.findLca(root,14, 16));
        System.out.println("LCA(3, 4) = " +
                tree.findLca(root,3, 4).data);
        System.out.println("LCA(2, 4) = " +
                tree.findLca(root,2, 4).data);
    }
}
