public class PrimeNumber {

    static void checkPrime(int num) {
            int i;
        if (num == 1) {
            System.out.println("minimum Prime number is 2");
        }
        for( i=2;i<num;i++)
        {
            if (num%i==0)
            {
                System.out.println("number is not prime "+num);
                break;
            }
        }
        if(i==num){
            System.out.println("Number is Prime "+num);
        }

    }

    public static void main(String[] args) {
        checkPrime(8);

    }
}


