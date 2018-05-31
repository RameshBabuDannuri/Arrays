package date_30_05_2018;


import java.util.ArrayList;
import java.util.List;

public class RootToLeafToSum {

    public boolean printPath(Node root, int sum, List<Node> path){
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            if(root.data == sum){
                path.add(root);
                return true;
            }else{
                return false;
            }
        }
        if(printPath(root.left, sum-root.data, path) ||
                printPath(root.right, sum - root.data, path)){
            path.add(root);
            return true;
        }
        return false;
    }

    public static void main(String args[]){

        Node root = new Node(10);

        root.left = new Node(16);
        root.left.right = new Node(-3);

        root.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(11);

        RootToLeafToSum rtl = new RootToLeafToSum();

        List<Node> result = new ArrayList<>();
        boolean r = rtl.printPath(root, 26, result);
        if(r){
            result.forEach(node -> System.out.print(node.data + " "));
        }else{
            System.out.println("No path for sum " + 22);
        }
    }
}

