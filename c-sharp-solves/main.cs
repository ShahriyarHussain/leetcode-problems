using System.Text.RegularExpressions;
class Problem_110
{
  static void Main(String[] args)
  {
    Console.WriteLine(isPalindrome("."));
  }

  public static string isPalindrome(string s)
  {
    string r = Regex.Replace(s.ToLower(), "[^a-z0-9]", "");
    return r;
    // return true;
  }
}