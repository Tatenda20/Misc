public class ShuffleString
{
    public static void main(String[] args)
    {
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(shuffle("codeleet", indices));
    }

    public static String shuffle(String str, int[] indices)
    {
        char[] newArr =new char[indices.length];
        for(int i = 0; i < indices.length; i++)
            {
            newArr[indices[i]]= str.charAt(i);
            }
        return String.valueOf(newArr);
    }
}
