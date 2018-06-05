package Array.date22_05_2018;

public class CheckDeadEndOrNot {
    static Node root = null;
    void insert(int data){
        root = insertRec(root,data);
    }
    Node insertRec(Node root, int data){
        if (root==null){
            root = new Node(data);
            return root;
        }
        if (root.data>data){
            root.left = insertRec(root.left, data);
        }
        else if (root.data<data){
            root.right = insertRec(root.right,data);
        }
        return root;
    }
    boolean DeadEnd(Node root , int min , int max){
        if (root == null){
            return false;
        }
        if (min == max){
            return true;
        }
        return DeadEnd(root.left, min, root.data - 1)||
        DeadEnd(root.right, root.data + 1, max);
    }
    public static void main(String[] args) {
        CheckDeadEndOrNot tree = new CheckDeadEndOrNot();

        /*       8
               /   \
              5    11
             /  \
            2    7
             \
              3
               \
                4 */
        tree.insert(8);
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(7);
        tree.insert(11);
        tree.insert(4);

        if (tree.DeadEnd(tree.root ,1 ,Integer.MAX_VALUE) == true)
            System.out.println("Yes ");
        else
            System.out.println("No " );
    }
}
