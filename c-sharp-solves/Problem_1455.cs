public class Solution
{
    public int IsPrefixOfWord(string sentence, string searchWord)
    {
        string[] array = sentence.Split(" ");

        for (int i = 0; i < array.Length; i++)
        {
            if (array[i].Length >= searchWord.Length)
            {
                if (array[i].StartsWith(searchWord))
                {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}