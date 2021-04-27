import java.util.Set;
import java.util.TreeSet;

public class TwoToOne
{
    public static void main(String[] args)
    {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
        //longest("xyaabbbccccdefww", "xxxxyyyyabklmopq");
    }

    public static String longest(String s1, String s2)
    {
        Set<Character> set = new TreeSet<>();
        for (char c : (s1 + s2).toCharArray())
            {
            set.add(c);
            }
        return set.toString().replaceAll("[\\[\\], ]", "");
    }
}
