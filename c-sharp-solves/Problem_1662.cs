public class Solution
{
    public bool ArrayStringsAreEqual(string[] word1, string[] word2)
    {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        foreach (var word in word1)
        {
            sb1.Append(word);
        }
        foreach (var word in word2)
        {
            sb2.Append(word);
        }

        return sb1.Equals(sb2);
    }
}