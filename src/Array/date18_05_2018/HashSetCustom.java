package Array.date18_05_2018;

public class HashSetCustom<E> {

    HashMapCustom<E, Object> map;
    private HashSetCustom(){
        map = new HashMapCustom();
    }
     public void add(E e){
        map.put(e,null);
     }
     public Object remove(E e){
         return map.remove(e);
     }

     public boolean contains(E e){
         return map.containsKey(e);
     }
     public void display(){
         map.displaySet();
     }
     public static void main(String args[]){
         HashSetCustom<Integer> set = new HashSetCustom<>();
         set.add(10);
         set.add(20);

         set.display();
         System.out.println("remove object "+set.remove(30));
         System.out.println(set.contains(10));
         set.display();
     }

}
