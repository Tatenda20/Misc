public class AddStrings
{
    public static void main(String[] args)
    {
        String nums1 = "298828660196", nums2 = "840477629533";
        System.out.println(add(nums1, nums2));
    }

     public static String add(String nums1, String nums2)
     {
         if(nums1 == null || nums2 == null)
         {
             return "0";
         }

         int carry = 0;
         String total = "";
         int length1 = nums1.length() -1, length2 = nums2.length() -1;
         while(Math.min(length1, length2) > 0)
         {
             int x = Character.getNumericValue(nums1.charAt(length1));
             int y = Character.getNumericValue(nums2.charAt(length2));
             int sum  = carry + x + y;
             carry = 0;
             if(sum > 9)
             {
                 carry = sum/10;
                 sum = sum%10;
             }
             total =  sum +""+ total;
             length1--;
             length2--;
         }
         return total;
     }
}