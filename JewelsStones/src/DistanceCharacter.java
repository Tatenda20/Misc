import java.util.Arrays;

public class DistanceCharacter
{
    public static void main(String[] args)
    {
        String str = "aaba";
        char ch = 'b';
        distance(str, ch);
    }

    private static int[] distance(String str, char ch)
    {
        int length = str.length();
        int[] result = new int[length];
        int [] position = new int[length];
        int pos = 0;
        for(int i = 0; i < length; i++)
        {
            if(str.charAt(i) == ch)
            {
                position[pos] = i;
                pos++;
            }
        }
        pos = 0;
        for (int j = 0; j < length; j++)
        {
            if(position[pos] - j == 0 && position[pos + 1] != 0)
            {
                result[j] = position[pos] - j;
                pos++;
            }
            else
            {
                if(pos > 1)
                {
                    result[j] =  Math.min(Math.abs(position[pos -1] -j), Math.abs(position[pos] -j));
                }
                else
                {
                    result[j] = Math.abs(position[pos] - j);
                }
            }
        }
        System.out.println(Arrays.toString(position));
        System.out.println(Arrays.toString(result));
        return result;
    }
}
