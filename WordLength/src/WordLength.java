public class WordLength
{
    public static void main(String[] args)
    {
        String str = "Hello World";
        System.out.println(wordLength(str));
    }
    public static int wordLength(String str)
    {
        String [] strArray = str.split("\\s+");
        return strArray[strArray.length -1].length();
    }
}
