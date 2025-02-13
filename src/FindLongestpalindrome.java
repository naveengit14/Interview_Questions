import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLongestpalindrome {


    public  String inputOriginal;
    public String words;
    public List<String>palindromeWords=new ArrayList<>();


    public  boolean  isPalindrome(String word){
          // input="madam have a racecar";

        String[] arrayInput=word.split(" ");
         for( String words:arrayInput)
         {
             char[] oneWord=words.toCharArray();
             int left=0;
             int right=words.length()-1;
              while(left<right)
              {
                  if(oneWord[left]!=oneWord[right])
                  {
                      System.out.println("word is not palindrome in String and word is  "+oneWord);
                      return false;
                  }
                  left++;
                  right--;
              }
//
         }

       return true;
    }



    public static void main (String []args)
    {
        FindLongestpalindrome oo=new FindLongestpalindrome();
        oo.isPalindrome("madam racecar abccba");


    }
}
