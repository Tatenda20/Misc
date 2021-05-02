public class SumOfString
{
    public static void main(String[] args)
    {
        System.out.println(sum("c1aa32bb4b5g"));
    }

    public static int sum(String str)
    {
        String num = "";
        int value = 0;
        for(int i = 0; i < str.length();i++)
            {
            if(!Character.isDigit(str.charAt(i)))
                {
                num = num +" ";
                }
            else
                {
                num = num + str.charAt(i);
                }
            }


        String [] strArray = num.split(" ");
        for (String s : strArray)
            {
            if (!s.isEmpty())
                {
                value = value + Integer.parseInt(s);
                }
            }
        return value;
    }
}
