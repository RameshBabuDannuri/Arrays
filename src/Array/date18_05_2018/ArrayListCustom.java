package Array.date18_05_2018;


import java.util.Arrays;

public class ArrayListCustom<E> {
    private static final int capacity= 10;
    private int size = 0;
    private Object array[] = {};

    ArrayListCustom(){
        array = new Object[capacity];
    }
    private void increamentCapacity(){
        int newCapacity = array.length*2;
        array = Arrays.copyOf(array,newCapacity);
    }
    public void add(E e){
        if (size == array.length){
            increamentCapacity();
        }
        array[size++] = e;
    }
    public E get(int index){
        if (index<0 || index >=size){
            return null;
        }
        return (E) array[index];
    }
    public  E remove(int index){
        if (index<0 || index>=size){
            return null;
        }
        Object deleteElement =  array[index];
        for (int  i = index ; i<size-1;i++){
            array[i] = array[i+1];
        }
        size--;
        return (E) deleteElement;
    }

    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public boolean contains(E e){
        if(size == 0){
            return false;
        }
        for (int  i =0 ; i<size; i++){
            if (array[i] == e){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayListCustom<Integer> list = new ArrayListCustom();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
        System.out.println();
        System.out.println("get "+list.get(1));
        System.out.println("removed value "+list.remove(2));
        System.out.println("contains "+list.contains(10));
        System.out.println("contains "+list.contains(30));


    }
}
