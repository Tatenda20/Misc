import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum
{
    public static void main(String[] args)
    {
        int [] nums = {-1,0,1,2,-1,-4};
        System.out.println(sum(nums));
    }

    public static List<List<Integer>> sum(int [] nums)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length < 3)
        {
            return result;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length -2;i++)
        {

        }


        return result;
    }
}
