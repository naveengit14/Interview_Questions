public class CountNumberofwordInString {

    static void countword(String input)
    {
        int count;
        String[]word=input.split(" ");
        count= word.length;
        System.out.println(count);
    }
    public static void main (String[]args)
    {
        countword("Naveen is testing program");
    }
}
