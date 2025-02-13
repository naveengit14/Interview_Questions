public class IsPalindromeBoolean {

    public static boolean isPalindrome(String input)
    {
        input=input.toLowerCase();
       char[]chars= input.toCharArray();
       int left=0;
       int right=chars.length-1;
       while(left<right)
       {
          if( chars[left]!=chars[right])
          {
              return false;

          }
          left++;
          right--;
       }

        return true;
    }

    public static void main(String[] args) {

//if (isPalindrome("MadAM"))
//{
    System.out.println("String is Palindrome or Not "+isPalindrome("MadAM"));
//}
//else {
  //  System.out.println("String is not Palindrome ");
//}


    }
}