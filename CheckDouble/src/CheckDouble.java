public class CheckDouble
{
    public static void main(String[] args)
    {
        int[] nums = {7,1,14,11};
        System.out.println(checkDouble(nums));
    }
    public static boolean checkDouble(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
            {
            for(int j = 0; j < nums.length; j++)
                {
                if(nums[i] == (nums[j]* 2))
                    {
                    return true;
                    }
                }
            }
        return false;
    }
}
