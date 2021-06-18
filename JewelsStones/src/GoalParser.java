public class GoalParser
{
    public static void main(String[] args)
    {
        String cmd = "G()()()()(al)";
        parserStuff(cmd);
    }

    public static void parserStuff(String  cmd)
    {
        System.out.println(cmd.replace("()", "o").replace("(al)", "al"));
    }
}
