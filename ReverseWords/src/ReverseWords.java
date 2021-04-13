import java.util.Arrays;

public class ReverseWords
{
    public static void main(String[] args)
    {
       String sentence = "This is a very long sentence";
       int wordLength = 4;
       reverseWords(sentence, wordLength);
    }
    public static String reverseWords(String str, int length)
    {
        String [] words = str.split(" ");
        for(int i = 0; i < words.length; i++)
            {
            if(words[i].length() >= 4)
                {
                StringBuilder strb = new StringBuilder(words[i]);
                String temp = strb.reverse().toString();
                words[i] = temp;
                }
            }

        return Arrays.toString(words);
    }
}
