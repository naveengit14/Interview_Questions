public class CountVowelsInString {
    static void countvowel(String str)
    {
        char[]arr=str.toCharArray();
        int vowel=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i] =='a' || arr[i]=='e' || arr[i]=='i'|| arr[i]== 'o'|| arr[i]=='u')
            {
                vowel++;
            }


        }
        System.out.println(vowel);


    }

    public static void main(String[] args) {
        countvowel("check how many vowels in this sentences");
    }
        }

