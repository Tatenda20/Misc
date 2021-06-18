public class MultiplyStrings
{
    public static void main(String[] args)
    {
        String nums1 = "298828660196", nums2 = "840477629533";
        System.out.println(add(nums1, nums2));
    }

    public static String add(String nums1, String nums2)
    {
        if (nums1 == null || nums2 == null)
        {
            return "0";
        }

        int carry = 0;
        String total1 = "";
        String total2 = "";
        int length1 = nums1.length() - 1, length2 = nums2.length() - 1;

        for(int i = length1; i > 0; i--)
        {
            int x = Character.getNumericValue(nums1.charAt(i));
            for(int j = length2; j > 0; j--)
            {
                int y = Character.getNumericValue(nums2.charAt(j));
                int temp = 0;
                int prod = x * y;
                temp = prod;
                prod = prod + carry;
                System.out.println(x +" * "+y +" is " + prod );
                carry = 0;
                if(prod > 9)
                {
                    carry = prod/10;
                    prod = prod%10;
                    System.out.println(carry + " is carry");
                }
                total1 = prod +""+ total1;
                //System.out.println(x +" * "+y +" is " + prod );

            }
           // System.out.println(total1);
        }
        return total2;
    }
}
