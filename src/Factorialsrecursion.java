public class Factorialsrecursion {
        // Recursive method to calculate factorial
        public static long factorial(int n) {
            if (n == 0 || n == 1) {
                return 1; // Base case: factorial of 0 or 1 is 1
            }
            return n * factorial(n - 1); // Recursive call
        }

        public static void main(String[] args) {
          //  int number = 5; // Change this number to calculate factorial for different values
            //System.out.println("Factorial of " + number + " is: " + factorial(number));
            System.out.println("factorials of number "+factorial(5));
        }
    }


