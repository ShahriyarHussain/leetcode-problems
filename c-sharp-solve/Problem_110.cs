using System.Text.RegularExpressions;
class Problem_110
{
  static void Main(String[] args)
  {
    Console.WriteLine(isPalindrome("A man, a plan, a canal: Panama"));
  }

  public static bool isPalindrome(string s)
  {
    string r = s.ToLower();
    for (int i = 0, j = r.Length - 1; i < j; i++, j--)
    {
      if (Char.IsLetterOrDigit(r[i]))
        if (r[i] != r[j])
        {
          return false;
        }
    }
    return true;
  }
}