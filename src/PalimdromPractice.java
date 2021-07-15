public class PalimdromPractice {
   static void checkpalindrom(String input)
   {
       String res="";
       char[]temp=input.toCharArray();
       for (int i=temp.length-1;i>=0;i--)
       {
            res= res+temp[i];
       }
       if (input.equalsIgnoreCase(res))
       {
           System.out.println("Given string is Palindrom");
       }
       else
       {
           System.out.println("Given string is not  Palindrom");
       }
   }
   public static void main (String[]args)
   {
       checkpalindrom("naveen");
   }
}
