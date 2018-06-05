package BinaryTree.date_31_05_2018.date_03_06_2018;

import java.util.*;

class Node{
    int data;
    int vd;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.vd = Integer.MAX_VALUE;
        this.left = null;
        this.right = null;
    }
}

public class DiagonalSum {
    static Node root;
    void dSum(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        Map<Integer , Integer> m = new TreeMap<>();

        root.vd = 0;
        q.add(root);

        while (!q.isEmpty()){
            Node curr = q.remove();
            int vd = curr.vd;
            while (curr!=null){
                int prevSum = (m.get(vd) == null ? 0 : m.get(vd));
                m.put(vd , prevSum+curr.data);
                if (curr.left!=null)
                {
                    curr.left.vd = vd+1;
                    q.add(curr.left);
                }
                curr = curr.right;
            }
        }
        Set<Map.Entry<Integer, Integer>> set = m.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = set.iterator();
        System.out.println("Diagonal sum in a binary tree is - ");
        while (iterator.hasNext())
        {
            Map.Entry<Integer, Integer> me = iterator.next();

            System.out.println(me.getValue()+" ");
        }
    }


    public static void main(String args[]){
        DiagonalSum tree = new DiagonalSum();
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

        tree.dSum(root);

    }
}
