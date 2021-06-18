public class EquPairs
{
    public static void main(String[] args)
    {
        int [] arr = {3, 2, 3, 2, 2};
        solve(arr);
    }

    public static int solve(int[] nums)
    {
        if(nums.length < 2)
        {
            return 0;
        }

        int counter = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j  = i + 1; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return counter;
    }
}
