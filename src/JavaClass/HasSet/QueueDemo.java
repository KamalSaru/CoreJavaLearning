package JavaClass.HasSet;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String>fruits= new PriorityQueue<>();
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println("Peak element is "+fruits.peek());

        Iterator itr= fruits.iterator();
        while (itr.hasNext());
        System.out.println(itr.next());
    }
}
