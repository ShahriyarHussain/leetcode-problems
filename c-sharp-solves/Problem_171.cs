public class Solution
{
    public int TitleToNumber(string columnTitle)
    {
        int result = 0;
        int baseValue = 26;
        for (int i = 0; i < columnTitle.Length; i++)
        {
            int charIndex = columnTitle.Length - 1 - i;
            result += (int)Math.Pow(baseValue, i) * (columnTitle[charIndex] - 64);
        }

        return result;
    }
}