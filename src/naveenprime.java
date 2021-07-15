class Naveenprime {

    static void checkprime(int num)
    {

        int i;
        if (num==0 || num==1)
        {
            System.out.println("Number is not prime minimum prime is 2 ");
        }
        for(i=2;i<=num;i++){
            if(num%i==0 && i!=num)
            {
                System.out.println("number is not prime "+num);
                break;
            }
            else
            {
                if (num%i==0 && i==num)
                {
                    System.out.println("number is prime " +num);
                    break;
                }
            }

        }
    }
    public static void main(String []args)
    {
        checkprime(17);
    }


}
