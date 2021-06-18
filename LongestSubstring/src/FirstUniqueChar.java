import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar
{
    public static void main(String[] args)
    {
        String str = "leetcolde";
        System.out.println(firstUniqChar(str));
    }

    public static int firstUniqChar(String s) {
        if(s.length() == 1)
        {
            return 1;
        }
        if(s == null)
        {
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+ 1);
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(map.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    }

}
