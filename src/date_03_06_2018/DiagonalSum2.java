package date_03_06_2018;

import java.util.LinkedList;
import java.util.Queue;

public class DiagonalSum2 {
    static Node root;
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    void Diagonal(Node root){
        if (root == null){
            return;
        }
       int sum=0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()){
            Node curr = q.poll();
            if (curr == null){
                System.out.println(" "+sum);
                sum = 0;
                q.offer(null);
                curr  = q.poll();
                if (curr == null){
                    break;
                }
            }
            while (curr!=null){
                sum = sum+curr.data;
                if (curr.left == null && curr.right ==null){
                    break;
                }
                if (curr.left!=null) {
                    q.offer(curr.left);
                }
                curr = curr.right;
            }
        }
    }
    public static void main(String args[]){
        DiagonalSum2 tree = new DiagonalSum2();
        root = new Node(1);
        root.left=new Node(2);
        root.left.left = new Node(9);
        root.left.right = new Node(6);
        root.left.right.left = new Node(11);
        root.left.left.right = new Node(10);
        root.right = new Node(3);
        root.right.right = new Node(5);
        root.right.left = new Node(4);
        root.right.left.right = new Node(7);
        root.right.left.left = new Node(12);

        tree.Diagonal(root);

    }
}
