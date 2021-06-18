import java.util.Arrays;
import java.util.HashMap;

public class TwoSum
{
    public static void main(String[] args)
    {
        int[] nums = {2,7,11,15,30,34,56,80};
        int target = 32;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int [] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] result = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                int index = map.get(nums[i]);
                result[0] = index;
                result[1] = i;
                break;
            }
            else
            {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
