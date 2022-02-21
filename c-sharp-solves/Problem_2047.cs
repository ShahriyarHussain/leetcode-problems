public class Solution
{
    public int CountValidWords(string sentence)
    {
        int validWords = 0;
        string[] words = sentence.Split();
        foreach (string word in words)
        {
            if (word.Equals("")) continue;
            int puncCount = 0, hyphenCount = 0;
            bool isValidWord = false;
            for (int i = 0; i < word.Length; i++)
            {
                isValidWord = false;
                char letter = word[i];
                if (hyphenCount > 1 || puncCount > 1) break;
                if (letter == '!' || letter == '.' || letter == ',')
                {
                    if (i != word.Length - 1) break;
                    puncCount++;
                }
                else if (letter == '-')
                {
                    if (i == 0 || i == word.Length - 1) break;
                    if (!(word[i + 1] >= 'a' && word[i + 1] <= 'z')) break;
                    hyphenCount++;
                }
                else if (letter < 'a' || letter > 'z') break;

                isValidWord = true;
            }

            if (isValidWord) validWords++;
        }

        return validWords;
    }
}