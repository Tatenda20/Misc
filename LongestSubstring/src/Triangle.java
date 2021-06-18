import java.util.ArrayList;
import java.util.List;

public class Triangle
{
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows)
    {
        List<Integer> values = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();


        for(int i = 0; i < numRows; i++)
        {
            values.add(0,1);
            for (int j = 1; j < values.size() -1; j++)
            {
                values.set(j, values.get(j) + values.get(j + 1));
                result.add(new ArrayList<Integer>(values));
            }
        }
        return result;
    }
}
