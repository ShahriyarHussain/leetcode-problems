package easy;

import java.util.Arrays;

public class Problem_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n * (n + 1))/2;
        for (int num : nums) {
            total -= num;
        }
        return total;
    }
}
