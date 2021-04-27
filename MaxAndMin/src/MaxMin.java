import java.util.Arrays;

public class MaxMin
{
    public static void main(String[] args)
    {
        int [] values = {3, -6,-5,5,-9 ,11, -8,22};
        System.out.println(maxMin(values));
    }
    public static int maxMin(int [] values)
    {
        int solution = 0;
        Arrays.sort(values);
        for(int j = 0; j < values.length -1; j++)
            {
            for(int i = values.length -1; i > 0; i--)
                {
                if(Math.abs(values[j]) == Math.abs(values[i]))
                    {
                    solution =  Math.abs(values[i]);
                    return  solution;
                    }
                }
            }
        return solution;
    }
}
