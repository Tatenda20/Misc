import java.util.HashSet;

public class longestSubstring
{
    public static void main(String[] args)
    {
        String str = "dvdf";
        System.out.println(lengthOfSub(str));
    }

    public static int lengthOfSub(String str)
    {
        int length = 0;
        if(str.length() == 0 || str == null)
        {
             return length;
        }


        HashSet<Character> set = new HashSet<>();
        int i = 0;
        for (int j = 0; j < str.length(); j++)
        {
            char c = str.charAt(j);
            if (!set.contains(c))
            {
                set.add(c);
                length = Math.max(length, set.size());
            }
            else
            {
                while (i < j)
                {
                    if (str.charAt(i) == c)
                    {
                        i++;
                        break;
                    }
                    set.remove(str.charAt(i));
                    i++;
                }
            }
        }
        return length;
    }
}
