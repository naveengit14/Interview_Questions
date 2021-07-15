import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class EachCharCountInString {

    static void charaterCount( String input) {
              //Creating a HashMap containing char a key and occurance as value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        // converting given string in Char array

        char[] strArray = input.toCharArray();
        // check each char of the strArray
        for (char c : strArray) {
            if (charCountMap.containsKey(c))
            {
                // if char is present  in charCountMap , increaement it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c,1);
            }
        }
        System.out.println(charCountMap);
        System.out.println(Collections.max(charCountMap.values()));
        System.out.println();

    }
    public static void main(String [] args){
        charaterCount("abbcccddee");
    }
}
