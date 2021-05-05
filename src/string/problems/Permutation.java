package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
    String str = " ABC" ;
    String rev =" " ;
    int len=str.length() ;
    for(int i =len-1 ; i >=0 ; i--){
        rev =rev + str.charAt(i) ;
    }
        System.out.println("permutation String of :" + rev);
    }
}
