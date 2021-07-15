import java.util.Arrays;

public class ShiftLeftArrayDynamic {
    static void shift(int n,int d, int[]arr) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7,8,9,10,11};
       // int d = 3;
       // int n = 11;
        if (arr.length!=n)
        {

            System.out.println("Wronge entery of array: value of n is : "+n+" and array entered by user is "+Arrays.toString(arr));
        }
        else {
            int[] temp = new int[d];
            System.out.println("Array before first left-Shift " + Arrays.toString(arr));
            for (int i = 0; i < d; i++) {
                temp[i] = arr[i];
                //emp[0]=arr[0] mean 1
                //temp [1]=arr[1] mean 2
                //System.out.println(arr[i]);
            }
            //System.out.println("Array after left shift " + Arrays.toString(arr));
            System.out.println("temp Array after left shift " + Arrays.toString(temp));
            for (int i = 0; i < n - d; i++) {
                arr[i] = arr[i + d];
            }
            System.out.println("After shift of the array " + Arrays.toString(arr));
            for (int i = 0; i < d; i++) {
                arr[n - d + i] = temp[i];
            }
            System.out.println("after insertion of temp array into array final shift of the array " + Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {

        shift(11,2, new int[]{1, 2, 3, 4, 5, 6, 7,8,9,10,11});
    }
}



