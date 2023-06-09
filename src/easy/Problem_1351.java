package easy;

public class Problem_1351 {
    public int countNegatives(int[][] grid) {
        int negativeCount = 0;
        for (int i = grid.length - 1; i > -1; i--) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    negativeCount += grid[i].length - j;
                    break;
                }
            }
        }
        return negativeCount;
    }
}
