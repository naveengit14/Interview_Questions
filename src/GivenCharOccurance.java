import java.util.Scanner;

public class GivenCharOccurance {
    public static void main (String [] args){

        String ss="agabbcddfggg";
        char c ='g';
        int count =ss.length()-ss.replace("g" ,"").length();
        System.out.println("Char "  +c +" repeated "+ count + " times" );
        System.out.println(ss);


    }
}
