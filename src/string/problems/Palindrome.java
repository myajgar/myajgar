package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter your String");
        String str =sc.next();
        String org_str =str ;
        String rev =" " ;
        int len =str.length();
        for(int i =len-1 ;i >=0 ; i--){
            rev=rev+str.charAt(i);
        }
        if(org_str.equals(rev)){
            System.out.println(org_str + "is palindrome String");
        }
        else {
            System.out.println(org_str +"is not palindrome String");
        }
    }
}
