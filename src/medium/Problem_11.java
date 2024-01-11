package medium;

public class Problem_11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < height.length && j > -1 && j != i;) {
            int smallerHeight = Math.min(height[i], height[j]);
            int area = smallerHeight * (j - i);
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[j] < height[i]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}
