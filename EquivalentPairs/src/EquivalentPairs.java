import java.util.HashMap;
import java.util.Map;


public class EquivalentPairs
{
    public static void main(String[] args)
    {
        int nums [] = {3, 2, 3, 2, 2};
        EqiPairs(nums);
    }

    private static int EqiPairs(int[] nums)
    {
        int counter = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            counter = counter + map.get(nums[i]) -1;
        }
        System.out.println(counter);
        return counter;
    }

}
