public class Solution
{
    public bool RotateString(string s, string goal)
    {
        char[] array = s.ToCharArray();
        for (int i = 0; i < array.Length; i++)
        {
            for (int j = 0; j < array.Length - 1; j++)
            {
                (array[j + 1], array[j]) = (array[j], array[j + 1]);
            }
            StringBuilder sb = new StringBuilder();
            foreach (char letter in array)
            {
                sb.Append(letter);
            }

            if (sb.ToString().Equals(goal))
            {
                return true;
            }
        }
        return false;
    }
}