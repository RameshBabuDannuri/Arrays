package date_26_05_2018;

public class FindDiameter {

    int getHeight(Node node){

        if(node == null){
            return 0;
        }
        int lh = getHeight(node.left);
        int rh = getHeight(node.right);

        return 1+Math.max(lh,rh);

    }

    int getDiameter(Node node){

        if(node == null ){
            return 0;
        }
        int lh = getHeight(node.left);
        int rh = getHeight(node.right);
        int ld= getDiameter(node.left);
        int rd = getDiameter(node.right);

        int fd = Math.max(lh+rh+1, Math.max(ld , rd));
        return fd;

    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);
        root.left.left.left.left = new Node(5);

        FindDiameter obj = new FindDiameter();
        System.out.print(obj.getDiameter(root));
    }
}
