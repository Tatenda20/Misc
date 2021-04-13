public class SingleRowKeyboard
{
    public static void main(String[] args)
    {
        System.out.println(keyCount("abcdefghijklmnopqrstuvwxyz","cba"));
    }

    public static int keyCount(String keyboard, String word)
    {
        int initialIndex = 0;
        int currentIndex = 0;
        int total = 0;
        for(int i = 0; i < word.length(); i++)
            {
            for(int j = 0; j < keyboard.length(); j++)
                {
                if(word.charAt(i) == keyboard.charAt(j))
                    {
                    currentIndex = j;
                    total = total + Math.abs(currentIndex - initialIndex);
                    initialIndex = currentIndex;
                    }
                }
            }
        return total;
    }
}
