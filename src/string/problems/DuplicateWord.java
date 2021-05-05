package string.problems;

import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        HashMap<String, Integer> mapofOccurance = new HashMap<>();
        String[] arrayofindividualword = st.replace(". " , "").split("  ");
        for (String individualword : arrayofindividualword) {
            Integer previousCount = mapofOccurance.get(individualword);

            if (previousCount == null) {
                previousCount = 0;

            }
            mapofOccurance.put(individualword, previousCount + 1);

            System.out.println(mapofOccurance);
        }
    }
}
