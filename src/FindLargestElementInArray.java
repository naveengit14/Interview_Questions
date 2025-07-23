import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FindLargestElementInArray {

    public static void findMax(int[] arr)
    {
        Arrays.sort(arr);
        for(int i= arr.length-1;i>0;i--)
        {
           if(arr[i]>arr[i-1])
           {
               System.out.println("2nd max number is "+arr[i-1]);
               break;
           }

        }

    }
    public static void main(String[]args)
    {
       // int[]arr={2,5,3,4,2,7,7,4,2,3};
        int[]arr={2,2,7,3,5,7,9,2,9};
        //int[]arr={2,2,2};
        findMax(arr);
    }


}
