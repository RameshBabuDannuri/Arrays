package BinaryTree.date_31_05_2018;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelByLevel {
    void levelByLevel(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();

        q1.add(root);
        while (!q1.isEmpty()||!q2.isEmpty()){
            while (!q1.isEmpty()){
                Node temp = q1.poll();
                System.out.print(temp.data+" ");
                if (temp.left!=null){
                    q2.add(temp.left);
                }
                if (temp.right!=null){
                    q2.add(temp.right);
                }
            }
            System.out.println();
            while (!q2.isEmpty()){
                Node temp = q2.poll();
                System.out.print(temp.data+" ");
                if (temp.left!=null){
                    q1.add(temp.left);
                }
                if (temp.right!=null){
                    q1.add(temp.right);
                }
            }
        }
    }
    public void levelByLevelOneQueueUsingCount(Node root) {
        if (root == null){
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        int levelCount = 1;
        int currentCount =0;
        q.offer(root);
        while (!q.isEmpty()){
            while (levelCount>0){
                root = q.poll();
                System.out.print(root.data+" ");

                if (root.left!=null){
                    currentCount++;
                    q.offer(root.left);

                }
                if (root.right!=null){
                    currentCount++;
                    q.offer(root.right);
                }
                levelCount--;
            }
            System.out.println();
            levelCount = currentCount;
            currentCount = 0;
        }
    }


    }
