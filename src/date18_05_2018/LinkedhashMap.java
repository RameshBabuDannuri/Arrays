package date18_05_2018;

import java.security.Key;

public class LinkedhashMap<K,V> {

    private Node<K,V> table[];
    private int capacity = 16;
    private Node<K,V> head;
    private Node<K,V> last;

    static class Node<K,V>{
        K key;
        V value;
        Node<K,V> next;
        Node<K,V> after , before;
        public Node(K key , V value , Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }
    public LinkedhashMap(){
        table = new Node[capacity];
    }
    private int hash(K key){
        return Math.abs(key.hashCode())%capacity;
    }
    public void put(K newKey, V data){

        if (newKey == null){
            return;
        }
        int hash = hash(newKey);
        Node<K,V> newNode = new Node<K,V>(newKey, data, null);


        if (table[hash] == null){
            table[hash] = newNode;
            if (head == null){
                head = newNode;
                last = newNode;
                return;
            }
            else {
                last.next = newNode;
                last.after = newNode;
                newNode.before = last;
                last = newNode;
            }
        }
        else {
            Node<K,V> previous = null;
            Node<K,V> current = table[hash];
            while (current!=null){
                if (current.key.equals(newKey)){
                    if (previous == null){
                        newNode.next = current.next;
                        table[hash] = newNode;
                        return;
                    }
                    else {
                        newNode.next = current.next;
                        previous.next = newNode;
                        return;
                    }
                }
                previous = current;
                current = current.next;
            }
            previous.next = newNode;
        }


    }
}

