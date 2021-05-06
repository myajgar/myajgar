package datastructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {
    public static void main(String[]args) {
        ArrayList<String> vs =new ArrayList<>();
        vs.add("mz");
        vs.add("it");
        vs.add("ah");
        vs.add("aw");
        vs.add("ig");
        ArrayList<String> vm = new ArrayList<>();
        vm.add("tod");
        vm.add("mod");
        vm.add("cod");
        vm.add("lod");
        ArrayList<String>vl =new ArrayList<>();
        vl.add("nj");
        vl.add("ct");
        vl.add("ny");

        HashMap<String ,ArrayList>cm =new HashMap<>();
        cm.put("stamford" , vs);
        cm.put("milford" , vm) ;
        cm.put("lagar" ,vl);
        System.out.println("-------------how to get specific keyvalue");
        System.out.println(cm.get("stamford"));
        System.out.println("----------------how to get the keys-----------------");
        System.out.println(cm.keySet());
        System.out.println("-----------------how to get the value of hash");
        System.out.println(cm.values());
        System.out.println("_______________how to chek the key if exit or not---------------");
        System.out.println(cm.containsKey("milford"));
        System.out.println("----------------how to see the size of the hash---------------");
        System.out.println(cm.size());
        System.out.println("-------how to display the hash or how to read the hash---------------");
        System.out.println(cm);
        System.out.println("------------------how to get value of the key-----------------------");
        System.out.println(cm.get("stamford"));
        System.out.println("-------------how to read the hash with inhanced forloop---------------");
        for (Map.Entry m : cm.entrySet()) {
            System.out.println(m.getKey() + "  " + m.getValue());
            System.out.println("---------------how to read the value of the hash with iterator class-------");
           Iterator ita = cm.entrySet().iterator();
            while (ita.hasNext()){
                System.out.println(ita.next());
            }
        }


        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use MySql Database to store data and retrieve data.
         */

    }

}
