public class Solution
{
    public int NumJewelsInStones(string jewels, string stones)
    {
        int stoneAndJewels = 0;
        foreach (char stone in stones)
        {
            foreach (char jewel in jewels)
            {
                if (stone == jewel)
                {
                    stoneAndJewels++;
                    break;
                }
            }
        }
        return stoneAndJewels;
    }
}