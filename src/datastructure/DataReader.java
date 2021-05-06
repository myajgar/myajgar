package datastructure;
import java.io.*;
import java.io.BufferedReader
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

    public static void main(String[] args)throws ClassNotFoundException ,SQLException {
        FileReader file =null;
        try{
            file=new FileReader("/src/data/self-driving-car");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        BufferedReader buff =new BufferedReader(file);
        String s = null;
        String s2=null;
        String s3 =null;
        String s4 =null;
        LinkedList<String> text =new LinkedList<>();
        Stack<String> stack =new Stack<>();
        while (true){
            try{
                if(!((s=buff.readLine())!=null)) break;
                System.out.println(s);

            }catch (IOException e){
                e.printStackTrace();
            }
            s2=s.replace("","");
            s3=s2.replace(" . " , " ");
            s4 =s3.replace("!","");
            String arr[] =s4.split("");
            for(String i : arr){
                text.add(i);
                stack.add(i);
            }
        }
        System.out.println("---------the linklist result-------------");
        System.out.println(text);
        System.out.println("------------------the stuck result------------");
        System.out.println("----------------pushing at the end of the stack--------------");
        stack.push("ali");
        stack.push("ajgar");
        stack.push("sumon");
        System.out.println(stack);
        System.out.println("------------peek from stack is taking from the last soked one-----------");
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println("--------------pooling from stack is poooling from the last one stacked--------");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("------------------how to read stack usisnginhanced for loop----------");
        for (String m : stack){
            System.out.println(m);
        }
        System.out.println("-----------how to use iterator to read stack-----------------");
        Iterator ita =stack.iterator();
        while (ita.hasNext()){
            System.out.println(ita.next());
        }
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use MySql Database to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

    }

}
