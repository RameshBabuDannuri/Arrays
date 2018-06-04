package date_04_05_2018;

public class FindMirrorNode {
    int FindNode(Node root , int target){
        if (root == null){
            return 0;
        }
        if (root.data == target){
            return target;
        }
        return find(root.left , root.right , target);
    }
    int find(Node r1 , Node r2 , int target){
        if (r1 == null || r2 == null){
            return  0;
        }
        if (r1.data == target){
            return r2.data;
        }
        if (r2.data == target){
            return r1.data;
        }
        int mv = find(r1.left , r2.right , target);
        if (mv != 0 ){
            return mv;
        }
       return find(r1.right , r2.left ,target);
    }
    public static void main(String args[]){
        FindMirrorNode tree = new FindMirrorNode();
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.left.right = new Node(7);

        root.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left =new Node(8);
        root.right.left.right = new Node(9);

        System.out.println("Morror node is : "+tree.FindNode(root , 2));
        System.out.println("Morror node is : "+tree.FindNode(root , 4));
        System.out.println("Morror node is : "+tree.FindNode(root , 6));
        System.out.println("Morror node is : "+tree.FindNode(root , 3));
        System.out.println("Morror node is : "+tree.FindNode(root , 1));
    }

}
