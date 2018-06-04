package date_31_05_2018;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftMostAndRightMostElement {
    void print(Node root){
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        boolean isFirst = false;
        boolean isOne = false;
        int last = 0;
        while (!q.isEmpty()){
            Node temp  = q.poll();

            if (isFirst){
                System.out.print(temp.data+" ");
                if (temp.left!=null){
                    q.add(temp.left);
                }
                if (temp.right!=null){
                    q.add(temp.right);
                }
            isFirst = false;
            isOne = true;
           }
            else if (temp == null){
                if (q.size() >= 1){
                    q.add(null);
                }
                isFirst = true;
                if (!isOne){
                    System.out.print(last+" ");
                }
            }
            else {
              last = temp.data;
              isOne = false;
              if (temp.left!=null){
                  q.add(temp.left);
              }
              if (temp.right!=null){
                  q.add(temp.right);
              }
            }
        }
    }
}
