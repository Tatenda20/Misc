public class RecursivePow
{
    public static void main(String[] args)
    {
        int i = 2, j = 2;
        System.out.println(powOf(i,j));
    }
    public static double powOf(double i, int j)
    {
        if(j == 0)
        {
            return 1;
        }
        if(j < 0)
        {
            return i/(i*powOf(i,-(j+1)));
        }

        if(j%2 == 0)
        {
            return powOf(i*i, j/2);
        }
        else
        {
            return i*powOf(i*i, (j-1)/2);
        }
    }
}
