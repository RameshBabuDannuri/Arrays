package BinaryTree.date_31_05_2018.date_30_05_2018;

import java.util.LinkedList;
import java.util.Queue;

public class LeveleOrderTraversal {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }

    void levelOrder(Node root){
           if(root == null){
               return;
           }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data+" ,");
            if (temp.left!=null){
                q.add(temp.left);
            }
            if (temp.right!=null){
                q.add(temp.right);
            }
        }
    }
    public static void main(String args[]){
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        LeveleOrderTraversal tree = new LeveleOrderTraversal();
        tree.levelOrder(root1);
    }
}
