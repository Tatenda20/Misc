import java.util.HashMap;

public class StringIsomorph
{
    public static void main(String[] args)
    {
        String s = "";
        String t = "";
        System.out.println(stringIso(s,t));
    }

    public static boolean stringIso(String s, String t)
    {
        if(s.length() < 1 || t.length() < 1)
        {
            return false;
        }

        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        String str = s+t;

        for(int i = 0; i < str.length(); i++)
        {
            Integer count = map.get(str.charAt(i));
            count = (count == null) ? 1: count++;
            map.put(str.charAt(i), count);
        }
        
        return false;
    }
}
