package date_30_05_2018;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {
    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right;
        }
    }

    static Node root;
   static void reverse(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<>();
        q.add(root);

        while (q.isEmpty() == false) {
           Node temp = q.peek();
            q.remove();
            s.push(temp);
            if (temp.right != null) {
                q.add(temp.right);
            }
            if (temp.left != null) {
                q.add(temp.left);
            }


        }
      // System.out.print("stack "+s.size());

       while (s.isEmpty() == false) {
            Node temp = s.peek();
            System.out.print(" "+temp.data);
            s.pop();
        }
    }

    public static void main(String args[]) {

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Level Order traversal of binary tree is :");
        reverse(root);
    }
}
