import java.util.Arrays;

// this does not work as intended
public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums)
    {
        int length = nums.length;
        if(length < 1)
            {
            return 0;
            }

        int i = 0;
        for(int j = 1; j < length; j++)
            {
            if(nums[j] != nums[i])
                {
                i++;
                nums[i] = nums[j];
                }
            }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }
}
