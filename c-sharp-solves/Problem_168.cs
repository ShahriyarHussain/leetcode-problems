public class Solution
{
    public string ConvertToTitle(int columnNumber)
    {
        StringBuilder sb = new StringBuilder();
        char startChar = 'A';
        while (columnNumber > 0)
        {
            sb.Insert(0, (char)(startChar + (columnNumber - 1) % 26));
            columnNumber = (columnNumber - 1) / 26;
        }

        return sb.ToString();
    }
}