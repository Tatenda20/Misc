import java.util.Arrays;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
    }

    public static int removeDuplicates(int[] nums)
    {
        int counter = 0;
        for(int i = 1; i < nums.length; i++)
            {
            if(nums[i] != nums[counter])
                {
                counter++;
                nums[counter] = nums[i];
                }
            }

        for(int k = 0; k < counter; k++)
            {
            System.out.print(nums[k]);
            }
        return counter;
    }
}
