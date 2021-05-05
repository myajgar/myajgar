package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
          */
        ArrayList<String> list =new ArrayList<>() ;
        list.add("milk") ;
        list.add("cereal") ;
        list.add("rice");
        list.add("juce") ;
        System.out.println(list);
        System.out.println(list.remove(1));

        for(int i =0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
        System.out.println("for each");
        for(String a : list){
            System.out.println(a);
        }
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }

}
