package BinaryTree.date_31_05_2018.date_03_06_2018;

import java.util.ArrayList;

public class SerializeAndDeserialize {
    int index = 0;
    void serialize(ArrayList<Integer> arr , Node root){

        if (root == null){
            arr.add(-1);
            return;
        }
        arr.add(root.data);
        serialize(arr,root.left);
        serialize(arr, root.right);
    }
    Node deSerialize(ArrayList<Integer> arr){
        if (index == arr.size()||arr.get(index) == -1 ){
            index += 1;
            return null;
        }
        Node root = new Node(arr.get(index));
        index += 1;

        root.left = deSerialize(arr);
        root.right = deSerialize(arr);

        return root;
    }
    void print(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
    public static void main(String args[]){
        Node tree = new Node(7);
        tree.left = new Node(4);
        tree.right = new Node(5);
        tree.left.left = new Node(6);
        tree.left.right = new Node(9);
        SerializeAndDeserialize ob = new SerializeAndDeserialize();
        ob.print(tree);
        System.out.println("After serialize");
        ArrayList<Integer> list = new ArrayList();
        ob.serialize( list, tree);
        Node newRoot =  ob.deSerialize(list);
        ob.print(newRoot);
    }
}
