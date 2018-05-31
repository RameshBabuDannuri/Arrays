package date_30_05_2018;
/*
Given a rooted tree with N vertices and N-1 edges.
We will be given many pairs of vertices u and v,
 we need to tell whether u is an ancestor of v or not.
 */
public class Ancestor {
    static boolean find(Node root, int u , int v){
        if (root == null){
            return false;
        }
        if (root.data == v){
            return true;
        }
        if (find(root.left ,u,v) || find(root.right, u, v)){
            if (root.data == u){
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Node root = new Node(0);
        root.left = new Node(1);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(6);

        root.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.left = new Node(7);
        boolean result = find(root,1,4);
        if (!result){
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
