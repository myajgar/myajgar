package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the first String");
        String str1 =scn.nextLine();
        System.out.println("enter the second String");
        String str2 =scn.nextLine();
        char[] w1 =str1.toLowerCase().toCharArray();
        char[] w2 =str2.toLowerCase().toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        boolean b =Arrays.equals(w1 ,w2) ;
        System.out.println("Anagram " + b);


    }
}
