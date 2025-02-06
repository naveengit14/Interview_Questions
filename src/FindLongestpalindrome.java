import java.util.Arrays;

public class FindLongestpalindrome {


    public static boolean  isPalindrome(){
          String input="madam have a racecar";
         String[] arrayinput=input.split(" ");
         for(String words:arrayinput)
         {
             char[] oneword=words.toCharArray();
             int left=0;
             int right=words.length()-1;
              while(left<right)
              {
                  if(oneword[left]!=oneword[right])
                  {
                      System.out.println("word is not palindrome in String and word is  "+oneword);
                      return false;
                  }
                  left++;
                  right--;
              }


         }


        return true;
    }

    public static void main (String []args)
    {
        isPalindrome();

    }
}
