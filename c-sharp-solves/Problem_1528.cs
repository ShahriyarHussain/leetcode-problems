public class Solution
{
    public string RestoreString(string s, int[] indices)
    {
        string restoredString = "";
        char[] stringArray = new char[s.Length];
        for (int i = 0; i < indices.Length; i++)
        {
            stringArray[indices[i]] = s[i];
        }

        foreach (var letter in stringArray)
        {
            restoredString += letter;
        }

        return restoredString;
    }
}