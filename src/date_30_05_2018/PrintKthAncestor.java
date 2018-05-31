package date_30_05_2018;

public class PrintKthAncestor {
    static int count = 0;
    static boolean kthAncestor(Node root, int target, int k) {

        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        if (kthAncestor(root.left, target, k) || kthAncestor(root.right, target, k)) {
            ++count;
               if (count == k)
                System.out.println("kth Ancestor is : " + root.data );
            return true;
        }
        return false;

    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);
        int  k = 2;
      kthAncestor(root ,7,k);
        if (count<k){
            System.out.println("kth ancestor is not available");
        }


    }
}
