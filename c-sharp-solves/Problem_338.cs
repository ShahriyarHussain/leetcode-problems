public class Solution
{
    public int[] CountBits(int n)
    {
        int[] result = new int[n + 1];

        for (int i = 0; i < result.Length; i++)
        {
            string s = Convert.ToString(i, 2);
            int countOnes = 0;
            foreach (char c in s)
            {
                if (c == '1') countOnes++;
            }
            result[i] = countOnes;
        }
        return result;
    }
}