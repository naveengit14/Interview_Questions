import java.util.Locale;

public class IsThereDuplicateCharInString {

    public static boolean IsDuplicateCharInString(String input)
    {
        input=input.toLowerCase(Locale.ROOT);
        char[] chararray=input.toCharArray();
        for(char character:chararray)
        {
            int count=input.length()-input.replaceAll(""+character,"").length();
            if(count>1)
            {
                System.out.println("there is  duplicate character in string ");
                return true;
            }

        }

        System.out.println("No character repeated in given String");
        return false;


    }
    public  static void main(String []args)
    {

        System.out.println("The answer should be True for abcdefa and the ANSWER IS--- "+IsDuplicateCharInString("abcdefa"));
        System.out.println("The answer should be False for abcdef and the ANSWER IS---"+IsDuplicateCharInString("abcdef"));
        System.out.println("The answer should be True for abcdef  and the ANSWER IS---"+IsDuplicateCharInString("aabbccdd"));

    }


}
