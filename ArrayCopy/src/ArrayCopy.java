import java.util.Arrays;

public class ArrayCopy
{
    public static void main(String[] args)
    {
        int [] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arrCopy(nums)));
    }

    public static int [] arrCopy(int [] nums)
    {
        int length = nums.length + 5;
        int [] newNums = Arrays.copyOf(nums, length);
        return  newNums;
    }
}
