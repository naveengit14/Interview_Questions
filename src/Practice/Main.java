package Practice;
import java.util.Locale;
//"static void main" must be defined in a public class.
public class Main {

    /**
     * Returns true if the input string has no repeating characters.
     *
     * abc -> true
     * aba -> false
     *
     * @param //input string
     * @return boolean
     */

    boolean uniqueCharacters(String str) {
        str=str.toLowerCase(Locale.ROOT);
        char[] chararray=str.toCharArray();
        for(char c:chararray)
        {
            int length=str.length()-str.replaceAll(""+c,"").length();
            if(length>1)
            {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        Main test = new Main();
        System.out.println("abcd should be true, is " + test.uniqueCharacters("abcd"));
        System.out.println("abca should be false, is " + test.uniqueCharacters("abca"));
        System.out.println("ababa should be false, is " + test.uniqueCharacters("ababa"));
    }
}