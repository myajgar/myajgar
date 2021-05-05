package datastructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         */
        Queue<String> queue = new PriorityQueue<>() ;
        queue.add("rice");
        queue.add("milk") ;
        queue.add("mango");
        queue.add("cereal") ;
        System.out.println(queue);
        System.out.println(queue.peek());
       // System.out.println(queue.remove());
        System.out.println(queue.poll());
        Iterator itr =queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
         queue.poll() ;
        queue .remove();

        }
    }


