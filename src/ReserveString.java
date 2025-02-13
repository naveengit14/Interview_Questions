import java.io.BufferedInputStream;
import java.util.Scanner;

public class ReserveString {

    public static void res()
    {
        String input;
        Scanner inputin=new Scanner(System.in);
        System.out.println("Enter the string");
        input=inputin.nextLine();
        char[]array=input.toCharArray();
        String rese="";
        for(int i=array.length-1;i>=0;i--)
        {
            rese =rese+array[i];
        }
        System.out.println(rese);

    }
    public static void main (String[]args)
    {
        res();

    }

}

