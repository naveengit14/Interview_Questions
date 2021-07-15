public class NumberPalindrom {

    static void checkNumberPalimdrom(int input)
    {
        int rem,res=0;
        int num=input;
        while (num>0)
        {
            rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        System.out.println(res);
        if (res==input)
        {
            System.out.println("Given Number is palindrom " +res);

        }
        else
        {
            System.out.println("Given Number is not palindrom");

        }


    }
    public static void main (String[]args)
    {
        checkNumberPalimdrom(122);

    }
}
