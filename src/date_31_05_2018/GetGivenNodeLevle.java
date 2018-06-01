package date_31_05_2018;

public class GetGivenNodeLevle {
    static  Node root;
    int getLevel(Node node , int k){
        int l = get(node , 1 , k);
        return l;
    }
    int get(Node node, int level , int k){
        if (node == null){
            return -1;
        }
        if (node.data == k){
            return level;
        }
        int level2 = get(node.left , level+1,k);
        if (level2 != -1){
            return level2;
        }
        return get(node.right , level+1 , k);
    }
    public static void main(String args[]){
        GetGivenNodeLevle tree = new GetGivenNodeLevle();

        root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);


        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print(tree.getLevel(root, 4));
    }



}
