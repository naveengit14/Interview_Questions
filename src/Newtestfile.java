public class Newtestfile {

    public static void checkAge(int age) throws IllegalArgumentException{

        try {
            String str = "123"; // invalid
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }


        }
        public static void main (String []args)
        {
            checkAge(12);

        }
    }

