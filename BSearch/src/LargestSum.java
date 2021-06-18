import java.util.Arrays;

public class LargestSum
{
    public static void main(String[] args)
    {
        int[] nums = {2, 4, 6, 2, 5};
        System.out.println(maxSum(nums));
    }

    public static int maxSum(int[] nums)
    {
        int maxVal = Arrays.stream(nums).max().getAsInt();
        if (maxVal < 0)
        {
            return 0;
        }

        int sumOne = nums[0];
        int sumTwo = 0;
        int newSum;

        for (int i = 1; i < nums.length; i++)
        {
            newSum = Math.max(sumOne, sumTwo);
            sumOne = sumTwo + nums[i];
            sumTwo = newSum;
        }

        return (Math.max(sumOne, sumTwo));
    }
}
