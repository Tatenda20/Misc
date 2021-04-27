import java.util.Arrays;

public class MergeArrays
{
    public static void main(String[] args)
    {
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,5,6};

        merge(nums1, nums2);
    }

    public static void merge(int[] nums1, int[] nums2)
    {
        String num1 = Arrays.toString(nums1);
        String num2 = Arrays.toString(nums2);
        String nums = num1 + num2;
        int [] nums3 = new int[num1.length() + num2.length()];
        for(int i = 0; i < nums.length(); i++)
            {
            nums3[i] = Character.getNumericValue(nums.charAt(i));
            }
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));
    }
}
