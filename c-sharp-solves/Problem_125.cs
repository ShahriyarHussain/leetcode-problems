// See https://aka.ms/new-console-template for more information


public class Problem_125
{
    public static void Main(string[] args)
    {
        Console.WriteLine(IsPalindrome("race a car"));
    }

    public static bool IsPalindrome(string s)
    {
        string givenString = s.ToLower();
        for (int i = 0, j = s.Length - 1; i < j;)
        {
            if (!Char.IsLetterOrDigit(givenString[i]))
            {
                i++;
                continue;
            }

            if (!Char.IsLetterOrDigit(givenString[j]))
            {
                j--;
                continue;
            }

            if (givenString[i] != givenString[j])
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }

        return true;
    }
}