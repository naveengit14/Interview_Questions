import java.util.ArrayList;
import java.util.List;

public class FindLongestpalindromeNewLogic {

    public String inputOriginal;
    public List<String> listOfPalindromeWords=new ArrayList<>();
    public List<Integer>lengthOfPalindromeWords=new ArrayList<>();
    public String words;
    public boolean iSPalindrome(String words)
    {
        int left=0;
        int right=words.length()-1;
        while(left<right)
        {
           if( words.charAt(left)!=words.charAt(right))
           {
               return false;
           }
           left++;
           right--;
        }
        return  true;

    }

    public void findPalindrome(String input)
    {
        String[] wordsArray=input.split(" ");
        int longestLength=0;
        String longestString="";
        for(String word:wordsArray)
        {

            if(iSPalindrome(word))
            {
               int length=word.length();
                listOfPalindromeWords.add(word);
                lengthOfPalindromeWords.add(word.length());
                System.out.println("Palindrome words found "+word+" and length of the word is " +word.length());
                if(length>longestLength)
                {
                    longestLength=length;
                    longestString=word;
                }
            }
        }
        System.out.println("list of Palindrome words  "+listOfPalindromeWords);
        System.out.println("largest Palindrome string is "+longestString+" and the length is "+longestLength);
    }



    public static void main (String []args)
    {
        FindLongestpalindromeNewLogic oo=new FindLongestpalindromeNewLogic();
        oo.findPalindrome("madam have racecar and civic duty abba abba racecar");




    }



}
