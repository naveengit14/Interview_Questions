public class StartByNumber {



    public static void main (String [] args)
    {
        System.out.println(" number start with 1 are");
       // int [] numbers={1,23,56,123,76,1432,1987};
        int [] numbers={3,23,56,323,76,3432,3987};

        for(int number:numbers)
        {
            if(String.valueOf(number).startsWith("1")){
                System.out.println(number+"\n");

        }
        }
    }


}
