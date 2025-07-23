

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElementInArrays {

    // Program to print duplicate element array

    public static void findDuplicate(int []arr)
    {
        Set<Integer> seen=new HashSet<>(),duplicate=new HashSet<>();
        for(int num:arr)
        {
            if(!seen.add(num))
            {
                duplicate.add(num);
            }
        }
        if(duplicate.isEmpty())
        {
            System.out.println("No duplicate element found in array ");
        }
        else {
            System.out.println("Duplicate numbers in array are" + duplicate);
        }
    }


    public static void main(String[]args)
    {
//int [] arr={1,4,2,5,7,3,2,1,0,5,3};
        int [] arr={1,2,3,4};
        findDuplicate(arr);

    }
}
