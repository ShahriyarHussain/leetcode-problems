package easy;

import java.util.Arrays;

public class Problem_268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return 0;

    }
}
