import java.util.Arrays;

public class SortArray
{
    public static void main(String[] args)
    {
        int [] result = {4,2,5,7};
        sortStuff(result);
    }

    private static int[] sortStuff(int [] nums)
    {
        int even = 0;
        int odd = 1;
        int [] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] %2 == 0)
            {
                result[even] = nums[i];
                even = even + 2;
            }
            else
            {
                result[odd] = nums[i];
                odd = odd + 2;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
