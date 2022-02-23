public class Solution
{
    IList<string> StringMatching(string[] words)
    {
        IList<string> listOfSubStrings = new List<string>();
        Array.Sort(words,
            (s, s1) => s1.Length < s.Length ? 1 : s1.Length > s.Length ? -1 : 0);

        for (int i = 0; i < words.Length; i++)
        {
            for (int j = words.Length - 1; j > i; j--)
            {
                if (words[j].Contains(words[i]))
                {
                    listOfSubStrings.Add(words[i]);
                    break;
                }
            }
        }

        return listOfSubStrings;
    }
}
