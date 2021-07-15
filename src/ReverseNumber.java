public class ReverseNumber {
    static  void doResvers (int input)
    {
        int rem,res=0;
        int num=input;
        while(num>0)
        {
            rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        if (input==res)
        {
            System.out.println("Given number is palindrome");
        }
        else
        System.out.println("Given number is not palindrome");
          }


    public static void main (String[]args)
    {
        doResvers(122);
    }
}
