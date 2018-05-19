package date18_05_2018;

import java.util.*;

class HashMapCustom<K,V> {

    private Node<K, V>[] table;
    private int capacity = 16;
    int count = 0;

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;


        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }

    public HashMapCustom() {
        table = new Node[capacity];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K newKey, V data) {
        if (newKey == null) {
            return;
        }
        int hash = hash(newKey);
        Node<K, V> newNode = new Node<>(newKey, data, null);

        if (table[hash] == null) {
            table[hash] = newNode;
            count++;
        } else {
            Node<K, V> previous = null;
            Node<K, V> current = table[hash];

            while (current != null) {
                if (current.key.equals(newKey)) {
                    if (previous == null) {
                        newNode.next = current.next;
                        table[hash] = newNode;
                        return;
                    } else {
                        newNode.next = current.next;
                        previous.next = newNode;
                        return;
                    }
                }
                previous = current;
                current = current.next;
            }
            previous.next = newNode;
            count++;
        }
    }

    public V get(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return null;
        } else {
            Node<K, V> temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        return null;
    }

    public boolean remove(K deleteKey) {
        int hash = hash(deleteKey);
        if (table[hash] == null) {
            return false;
        } else {
            Node<K, V> previous = null;
            Node<K, V> current = table[hash];
            while (current != null) {
                if (current.key.equals(deleteKey)) {
                    if (previous == null) {
                        table[hash] = table[hash].next;
                        count--;
                        return true;
                    } else {
                        previous.next = current.next;
                        count--;
                        return true;
                    }
                }
                previous = current;
                current = current.next;
            }
        }
        return false;

    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return count;
    }

    public Set<K> keySet() {
        Set<K> set = new LinkedHashSet<>();
        if (isEmpty()) {
            return null;
        }
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Node<K, V> temp = table[i];
                while (temp != null) {
                    set.add(temp.key);
                    temp = temp.next;
                }
            }
        }
        return set;
    }

    public Set<Node<K, V>> entrySet() {
        if (isEmpty()) {
            return null;
        }
        Set<Node<K, V>> entrySet = new LinkedHashSet<>();
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Node<K, V> temp = table[i];
                while (temp != null) {
                    entrySet.add(temp);
                    temp = temp.next;
                }
            }
        }
        return entrySet;
    }

    public List<Integer> values() {
        if (isEmpty()) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            Node<K, V> temp = table[i];
            if (table[i] != null) {
                while (temp != null) {
                    list.add((Integer) temp.value);
                    temp = temp.next;
                }
            }
        }
        return list;
    }

    public boolean containsKey(K searchKey) {
        if (isEmpty()) {
            return false;
        }
        int hash = hash(searchKey);
        if (table[hash] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Node<K, V> temp = table[i];
                while (temp != null) {
                    System.out.print("[" + temp.key + " = " + temp.value + "]");
                    temp = temp.next;
                }
            }
        }
    }

    public void displaySet() {

        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                Node<K, V> node = table[i];
                while (node != null) {
                    System.out.print(node.key + " ");
                    node = node.next;
                }
            }
        }
    }
}
public class ImplementationOfHashMap {
    public static void main(String args[]) {
        HashMapCustom<Integer, Integer> map = new HashMapCustom<>();
        map.put(10,1);
        System.out.println("size = "+map.size());
        map.remove(10);
        System.out.println("size = "+map.size());


        map.put(20,2);
        map.put(30,3);
        map.put(40,1);
        map.put(50,2);
        map.put(60,3);
        System.out.println();
        map.display();
        map.remove(20);
        System.out.println();
        map.display();
        System.out.println();
        System.out.print("keys   = "+map.keySet());

        System.out.println("values = "+map.values());

        System.out.println("search key "+map.containsKey(50));
        System.out.println("search key "+map.containsKey(55));
        map.put(50,4);
        System.out.println("search key "+map.containsKey(50));


        Iterator<HashMapCustom.Node<Integer, Integer>> iterator = map.entrySet().iterator();
        System.out.println("entrySet() => :");
        while(iterator.hasNext())
        {
            HashMapCustom.Node<Integer, Integer> entry = iterator.next();
            System.out.print(entry.key+ "->"+entry.value +" ,");

        }



    }
}
