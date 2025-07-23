public class FactorialNum {

    static void calfact(int num)
    {
        int fact=1;
        int i=1;
        while( i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
    public static void main (String []args)
    {
        calfact(3);

    }


}


