package easy;

public class Problem_1025 {

    public boolean divisorGame(int n) {
        if (n == 2) return true;
        byte[] cache = new byte[n + 1];
        return canWin(n, cache);
    }

    public boolean canWin(int n, byte[] cache) {
        if (n <= 1) return false;
        if (cache[n] != 0) return cache[n] == 1;

        for (int x = 1; x < n/2; x++) {
            if (n % x == 0) {
                if (!canWin(n - x, cache)) {
                    cache[n] = 1;
                    return true;
                }
            }
        }
        return false;
    }
}