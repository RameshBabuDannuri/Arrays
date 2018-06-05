package BinaryTree.date_31_05_2018.date_04_06_2018;

import java.util.HashMap;

public class VerticalOrderSum {
   static void vSum(HashMap<Integer ,Integer> hash , Node root, int h){
       if (root.left!=null){
           vSum(hash , root.left , h-1);
       }
       if (root.right!=null){
           vSum(hash,root.right ,h+1);
       }
       int sum= 0;
       if (hash.containsKey(h)){
           sum = hash.get(h);
       }
       hash.put(h , root.data+sum);
   }
    public static void verticalSum(Node root){
        HashMap<Integer , Integer> hash = new HashMap<>();
        vSum(hash , root , 0);
        System.out.println();
        for (int k:hash.keySet()){
            System.out.println("key(pos): "+k+ " sum : "+hash.get(k));
        }
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        System.out.println("Vertical Order traversal sum");
        verticalSum(root);
    }
}
