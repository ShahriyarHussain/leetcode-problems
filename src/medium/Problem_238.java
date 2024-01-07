package medium;

public class Problem_238 {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length < 2) return nums;
        int[] results = new int[nums.length];
        int prefix = 1;
        results[0] = prefix;
        for (int i = 1; i < results.length; i++) {
            prefix *= nums[i-1];
            results[i] = prefix;
        }
        int postfix = 1;
        for (int i = nums.length - 1; i > -1; i--) {
            results[i] *= postfix;
            postfix *= nums[i];
        }
        return results;
    }
}
