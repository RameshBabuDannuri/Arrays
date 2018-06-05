package BinaryTree.date_31_05_2018.date_30_05_2018;

public class FindDistance {

    int findDistance(Node root , int n1, int n2){

        Node lca = findLCA(root , n1,n2);

        int d1 = findLevel(lca ,n1 , 0);
        int d2 = findLevel(lca ,n2 , 0);

        return d1+d2;
    }
     Node findLCA(Node node, int n1, int n2){

        if (node == null){
            return null;
        }
        if (node.data == n1 || node.data == n2){
            return node;
        }
        Node lLca = findLCA(node.left , n1,n2);
        Node rLca = findLCA(node.right , n1,n2);

        if (lLca!=null && rLca!=null){
            return node;
        }
        if (lLca!=null){
            return lLca;
        }
        else {
            return rLca;
        }
    }
    int findLevel(Node node1 , int n, int level){

            if (node1 == null){
                return -1;
            }
            if (node1.data == n){
                return level;
            }

            int count = findLevel(node1.left , n , level+1);

            if (count == -1){
                return findLevel(node1.right , n , level+1);
            }
            return count;
    }
    public static void main(String[] args) {

        FindDistance tree = new FindDistance();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);


      System.out.println("Dist(3,4) = "
              + tree.findDistance(root, 3, 7));

        System.out.println("Dist(4, 6) = "
                + tree.findDistance(root, 4, 6));
        System.out.println("Dist(4, 7) = "
                + tree.findDistance(root, 4, 7));
        System.out.println("Dist(2, 8) = "
                + tree.findDistance(root, 2, 8));
    }
}
