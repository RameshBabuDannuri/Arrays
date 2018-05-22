package date22_05_2018;

import java.util.*;

class Pair{
    int num;
    int count;
    public Pair(int num , int count){
        this.num = num;
        this.count = count;
    }
}
public class Top_K_Frequent_Elements {
    public List<Integer> TopKfrequent(int a[] , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int e: a){
            if (map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }
            else {
                map.put(e,1);
            }
        }
        //create min heap
        PriorityQueue<Pair> queue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.count-o2.count;
            }
        });

        for (Map.Entry<Integer, Integer> entry:map.entrySet()){
            Pair p =new Pair(entry.getKey() , entry.getValue());
            queue.offer(p);
            if (queue.size()>k){
                queue.poll();
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        while(queue.size()>0){
            result.add(queue.poll().num);
        }
        //reverse the order
        Collections.reverse(result);

        return result;

    }
    public static void main(String args[]){
        int a[] = {1,1,1,2,2,3,3,3,3,3,4,4,4,4};
        Top_K_Frequent_Elements ob = new Top_K_Frequent_Elements();
        List<Integer> list = ob.TopKfrequent(a,2);
        for (Integer e:list
             ) {
            System.out.println(e);

        }
    }
}
