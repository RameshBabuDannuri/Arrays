package date_31_05_2018;

import java.util.LinkedList;
import java.util.Queue;

public class FindAVGByEachLevel {
    Node root;

    void avg(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            float sum = 0 , count = 0;
            Queue<Node> temp = new LinkedList<>();
            while (!q.isEmpty()){
                Node n = q.poll();
                sum = sum+n.data;
                count++;
                if (n.left!=null){
                    temp.offer(n.left);
                }
                if (n.right!=null){
                    temp.offer(n.right);
                }
            }
            q = temp;
            System.out.println(sum *1.0 / count +" ");
        }
    }
    public static void main(String args[]){
        FindAVGByEachLevel tree = new FindAVGByEachLevel();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.avg(tree.root);
    }
}
