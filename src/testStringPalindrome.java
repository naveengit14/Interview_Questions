public class testStringPalindrome {

    static void checkPalindrome(String input)
    {
        String res="";
        char [] array=input.toCharArray();
        for (int i=array.length-1;i>=0;i--)
        {
            res=res+array[i];


        }
        System.out.println(res);
        if (res.equalsIgnoreCase(input)){
            System.out.println("string is palindrome");
        }
        else {
            System.out.println("string is not palindrome");
        }
    }
    public static void main (String []args)
    {
        checkPalindrome("121");

    }
}
