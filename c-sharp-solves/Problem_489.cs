public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine(RepeatedSubstringPattern("abcdeabcd"));
    }
    public static bool RepeatedSubstringPattern(string s)
    {
        int len = s.Length;
        for (int i = len / 2; i > 0; i--)
        {
            if (len % i == 0)
            {
                int repeats = len / i;
                String subString = s.Substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < repeats; j++)
                {
                    sb.Append(subString);
                }

                if (sb.ToString().Equals(s))
                {
                    return true;
                }
            }
        }

        return false;
    }
}