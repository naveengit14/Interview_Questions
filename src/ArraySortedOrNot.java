
import java.util.*;
class ArraySortedOrNot {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        int[] original=arr.clone();
        Arrays.sort(arr);
        //int[] sorted=arr;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(original));
        if(Arrays.equals(original,arr))
        {
            System.out.println(" array is  sorted ");
            return true;
        }
        else{
            System.out.println(" array is not sorted ");
            return false;

        }

    }
    public static void main(String[]args)
    {
        ArraySortedOrNot ss=new ArraySortedOrNot();
        int [] input={1,4,6,8,19,100,3};
        ss.arraySortedOrNot(input);

    }
}