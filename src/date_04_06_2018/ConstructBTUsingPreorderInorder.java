package date_04_06_2018;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class ConstructBTUsingPreorderInorder {
    public Node BuildBT(int[] preorder , int[] inorder)
    {
        if (preorder.length == 0 || preorder.length!=inorder.length){
            return null;
        }
        return Build(preorder , 0 , preorder.length-1 ,
                      inorder , 0 , inorder.length-1);
    }
    public Node Build(int[] preOrder , int preStrat , int preEnd ,
                      int[] inOrder , int inStart , int inEnd)
    {

        if (preStrat>preEnd || inStart > inEnd){
            return null;
        }
        int data = preOrder[preStrat];

        Node root = new Node(data);

        int offset = inStart;

        for (;offset<inEnd ; offset++){
            if (inOrder[offset] == data){
                break;
            }
        }
        root.left =Build(preOrder,preStrat+1,preStrat+offset-inStart ,
                           inOrder , inStart , offset-1);
        root.right = Build(preOrder , preStrat+offset-inStart+1 ,preEnd,
               inOrder ,offset+1,inEnd );
        return root;
    }

    void inorderTraversal(Node node){
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }
    public static void main(String args[]){
        ConstructBTUsingPreorderInorder tree = new ConstructBTUsingPreorderInorder();
        int[] inorder = {4,2,5,1,6,3,7};
        int[] preorder = {1,2,4,5,3,6,7};
       Node root = tree.BuildBT(preorder , inorder);
       tree.inorderTraversal(root);
    }
}
