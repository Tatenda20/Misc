public class RLE
{
    public static void main(String[] args)
    {
        runLength("abbbbbbcccdeeefghhhhhhiiiiiijsssllllnmmmsxxxxxyz");
    }

    public static void runLength(String str)
    {
        int n = str.length();
        for (int i = 0; i < n; i++)
            {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
                {
                count++;
                i++;
                }
            System.out.print(str.charAt(i));
            if (count > 1)
                {
                System.out.print(count);
                }
            }
    }
}
