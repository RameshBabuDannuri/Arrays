package BinaryTree.date_31_05_2018.date_04_06_2018;

 class MergeTwoTreesSum {
  static   Node merge(Node t1, Node t2){
        if (t1==null){
            return t2;
        }
        if (t2==null){
            return t1;
        }
        t1.data = t1.data +t2.data;
        t1.left = merge(t1.left,t2.left);
        t1.right = merge(t1.right , t2.right);
        return t1;
    }
    void inorder(Node root){
        if (root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String args[]){
       MergeTwoTreesSum treesSum = new MergeTwoTreesSum();

        Node t1 = new Node(1);
        t1.left = new Node(2);
        t1.right = new Node(3);
        t1.left.left = new Node(4);
        Node t2 = new Node(1);
        t2.left = new Node(2);
        t2.right = new Node(3);
        t1.left.right = new Node(5);
        Node root = merge(t1,t2);

        treesSum.inorder(root);


    }
}
