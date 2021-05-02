public class InsertAtPosition
{
    public static void main(String[] args)
    {
        int [] numbers = {0,1,3,4,6,8};
        int target = 5;
        System.out.println(insertAt(numbers, target));
    }

    public static int insertAt(int [] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
            {
            if(nums[i] == target)
                {
                return i;
                }
            else if (nums[i] > target)
                {
                return i;
                }
            }
        return nums.length;
    }
}
