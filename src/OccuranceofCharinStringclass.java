import java.util.HashMap;
public class OccuranceofCharinStringclass {
    static void charcountmethod( String input)
    {
        char[] chararray=input.toCharArray();
        HashMap<Character,Integer> map =new HashMap<>();
        for (char c:chararray){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else
                {
                map.put(c,1);
                }
        }
        System.out.println(map);

    }
    public static void main (String[]args)
    {
        charcountmethod("aabbccddeerrrrrrrgg");
    }
}


