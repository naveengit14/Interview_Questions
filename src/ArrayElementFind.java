import java.util.Arrays;
import java.util.HashSet;

public class ArrayElementFind {

    public static void findElement(int[] input,int nthElement)
    {
        Arrays.sort(input);
        System.out.println("Sorted array "+ Arrays.toString(input));
        HashSet<Integer> noDup=new HashSet<>();
        for(int ele:input)
        {
            noDup.add(ele);

        }
       int[] finalArray= noDup.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(" No duplicate value in Array "+Arrays.toString(finalArray));
        int element=finalArray[finalArray.length-nthElement];
        System.out.println(" element value on nth highest in given Array is "+element);

    }
    public  static void main (String []args)
    {
        findElement(new int[]{2, 5, 3, 1, 6, 7, 4, 7, 8},3);


    }

}
