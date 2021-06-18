import java.util.Arrays;

public class PlusOne
{
    public static void main(String[] args)
    {
        int [] nums = {1,3,4,9};
        System.out.println(Arrays.toString(addOne(nums)));
    }

    private static int[] addOne(int[] nums)
    {
        if(nums.length == 1 && nums[0] < 8)
        {
            nums[0] = nums[0] + 1;
            return nums;
        }

        int [] solution = nums;
        int carry = 0;
        int length = solution.length;

        int sum = 1 + nums[length -1];
        if(sum > 9)
        {
            carry = sum/10;
            sum = sum%10;
            int i = solution.length -1;
            while (i > 1)
            {
                solution[i] = sum;
                i--;
                sum = carry + nums[i];
                if(sum > 9)
                {
                    carry = sum / 10;
                    sum = sum % 10;
                }
                else
                {
                    break;
                }
            }
        }
        else
        {
            solution[solution.length -1] = sum;
        }
        return solution;
    }
}

