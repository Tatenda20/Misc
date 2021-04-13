import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones
{
    public static void main(String[] args)
    {
        System.out.println(jewelCount("aA", "aAAbbbb"));
    }

    public static int jewelCount(String jewels, String stones)
    {
        int count = 0;
        Set<Character> charSet = new HashSet<>();
        for(char ch: jewels.toCharArray())
            {
            charSet.add(ch);
            }

        for(char chr: stones.toCharArray())
            {
            if(charSet.contains(chr))
                {
                count++;
                }
            }
        return count;
    }

}
