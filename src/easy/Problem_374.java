package easy;

public class Problem_374 {
    public int guessNumber(int n) {
        if (guess(n) == 0) return n;
        int left = 0;
        int right = n;
        int pick = left + (left + right)/2;
        while (left <= right) {
            int check = guess(pick);
            if (check == -1) {
                right = pick;
            } else if (check == 1) {
                left = pick;
            } else {
                return pick;
            }
            pick = left + ((right - left)/2);
        }
        return left;
    }

    private int guess(int i) {
        int pick = 100;
        return Integer.compare(pick, i);
    }
}
