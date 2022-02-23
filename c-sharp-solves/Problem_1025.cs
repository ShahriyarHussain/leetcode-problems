public class Solution
{
    public bool DivisorGame(int n)
    {
        int[] steps = new int[n + 1];
        return CanWin(n, steps);
    }


    public bool CanWin(int n, int[] steps)
    {
        if (n <= 1) return false;

        if (steps[n] != 0)
        {
            return steps[n] == 1 ? true : false;
        }

        for (int x = 1; x < n; x++)
        {
            if (n % x == 0)
            {
                if (!CanWin(n - x, steps))
                {
                    steps[n] = 1;
                    return true;
                }
            }
        }
        return false;
    }
}