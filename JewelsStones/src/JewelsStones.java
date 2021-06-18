import java.util.HashSet;
import java.util.Set;

public class JewelsStones
{
    public static void main(String[] args)
    {
        String jewels = "aA";
        String stones = "aAAbbbb";
        jewelsFind(jewels, stones);
    }

    public static void jewelsFind(String jewels, String stones)
    {
        int count = 0;
        Set<Character> charSet = new HashSet<>();
        for(char ch: jewels.toCharArray())
        {
            charSet.add(ch);
        }

        for (char ch : stones.toCharArray())
        {
            if(charSet.contains(ch))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
