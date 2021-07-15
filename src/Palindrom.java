public class Palindrom {
    static void checkString(String str)
    {
         String res="";

        char[] temp =str.toCharArray();
        for (int i=temp.length-1;i>=0;i--)
        {
            res= res+temp[i];
            System.out.println(res);
        }
        if (res.equalsIgnoreCase(str))
        {
            System.out.println("Given String is palindrom");
        }
        else{
            System.out.println("Given String is not palindrom");

        }
    }
    public static  void main (String []args)
    {
        checkString("naveen");
    }

}
