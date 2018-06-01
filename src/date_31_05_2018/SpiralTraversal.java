package date_31_05_2018;

import java.util.Stack;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class SpiralTraversal {

  static Node root;

    static void spiral(Node root){
        if (root == null){
            return;
        }
        Stack<Node> s1= new Stack();
        Stack<Node> s2 = new Stack<Node>();

        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node temp = s1.peek();
                s1.pop();
                System.out.print(temp.data+" ");
                if (temp.right!=null){
                    s2.push(temp.right);
                }
                if (temp.left!=null){
                    s2.push(temp.left);
                }
            }
            while (!s2.isEmpty()){
                Node temp = s2.peek();
                s2.pop();
                System.out.print(temp.data+" ");
                if (temp.left!=null){
                    s1.push(temp.left);
                }
                if (temp.right!=null){
                    s1.push(temp.right);
                }
            }
        }

    }
    public static void main(String args[]){
        SpiralTraversal tree = new SpiralTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);
        System.out.println("Spiral Order traversal of Binary Tree is ");
        spiral(root);
    }
}
