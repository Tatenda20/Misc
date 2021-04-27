import java.util.Arrays;

public class Isogram
{
    public static void main(String[] args)
    {
        System.out.println(isIsogram(""));
    }

    public static boolean isIsogram(String str)
    {
        str = str.toLowerCase();
        if (str.length() == 0)
            {
            return true;
            }
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        for (int i = 1; i < ch.length; i++)
            {
            if (ch[i] == ch[i - 1])
                {
                return false;
                }
            }
        return true;
    }
}
