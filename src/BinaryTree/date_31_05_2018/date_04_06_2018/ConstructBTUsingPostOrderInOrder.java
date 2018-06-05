package BinaryTree.date_31_05_2018.date_04_06_2018;

public class ConstructBTUsingPostOrderInOrder {
    public Node BuildBT(int[] postorder , int []inorder){
        if (postorder.length==0 || postorder.length!=inorder.length){
            return null;
        }
        return Build(postorder ,0,postorder.length-1 ,inorder , 0 ,inorder.length-1);
    }
    Node Build(int post[] , int postStr , int postEnd ,
               int in[] , int inStr , int inEnd){
        if (postStr>postEnd || inStr>inEnd){
            return null;
        }
        int data = post[postEnd];
        Node root = new Node(data);
        int offset = inStr;
        for (;offset<inEnd ;offset++){
            if (in[offset] == data){
                break;
            }
        }
        root.left = Build(post , postStr , postStr+offset-inStr-1 ,
                          in , inStr , offset-1);
        root.right = Build(post ,postStr+offset-inStr ,postEnd-1,
                            in , offset+1 ,inEnd);
        return root;
    }
    void inorderTraversal(Node node){
        if (node != null) {
            inorderTraversal(node.left);
            inorderTraversal(node.right);
            System.out.print(node.data + " ");

        }
    }
    public static void main(String args[]){
        ConstructBTUsingPostOrderInOrder tree = new ConstructBTUsingPostOrderInOrder();
        int[] inorder = {4,2,5,1,6,3,7};
        int[] postorder = {4,5,2,6,7,3,1};
        Node root = tree.BuildBT(postorder , inorder);
        tree.inorderTraversal(root);
    }
}
