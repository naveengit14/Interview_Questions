import java.util.LinkedHashSet;

public class RemoveDuplicateString {

    public static void removeDuplicate()
    {
        String input="Naveen is very naveen new and see many naveen and thing go";
        // naveen is very new and see many thing go
        input=input.toLowerCase();

        String [] arr=input.split(" ");
        LinkedHashSet<String>nodup=new LinkedHashSet<>();
        for(String word:arr)
        {
            nodup.add(word);
        }
        //System.out.println("String with out duplicate word is :-- "+String.join(" ",nodup));
        System.out.println("String with out duplicate word is :--" +nodup);
    }
    public static void main (String []args)
    {
        removeDuplicate();

    }

}
