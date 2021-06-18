import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decompress
{
    public static void main(String[] args)
    {
        int [] nums = {1,1,2,3};
        System.out.println(Arrays.toString(decompress(nums)));
    }

    public static int [] decompress( int[] nums)
    {
        List<Integer> list = new ArrayList<>();

        for(int k = 0; k < nums.length; k += 2)
        {
            for(int counter = nums[k]; counter > 0; counter--)
            {
                list.add(nums[k+1]);
            }
        }
        int [] result = new int [list.size()];
        for(int a = 0; a < list.size(); a++)
        {
            result[a] = list.get(a);
        }
        return result;
    }
}
