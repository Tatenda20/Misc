public class StringHandling
{
    public static void main(String[] args)
    {
        System.out.println(isAnagram("aacc", "caac"));
    }

    public static boolean isAnagram(String s, String t)
    {
        char [] ch = t.toCharArray();

        for (int i = 0; i < s.length(); i++)
        {
            for(int j = 0; j < ch.length; j++)
            {
                if(s.charAt(i) == ch[j])
                {
                    ch[j] = '*';
                    break;
                }
            }
        }
        for(int k = 0; k < ch.length; k++)
        {
            if(ch[k] != '*')
            {
                return false;
            }
        }
        return true;
    }
}
