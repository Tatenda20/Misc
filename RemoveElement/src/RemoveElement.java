import java.util.Arrays;

public class RemoveElement
{
    public static void main(String[] args)
    {
        int [] nums = {0,1,2,2,3,0,4,2};
        int value = 2;
        System.out.println(removeElement(nums, value));
    }
    public static int removeElement(int [] arr, int target)
    {
        int counter = 0;
        for(int i = 0; i < arr.length; i++)
            {
            if(arr[i] != target)
                {
                arr[counter] = arr[i];
                counter++;
                }
            }
        System.out.println(Arrays.toString(arr));
        return arr.length - counter;
    }
}
