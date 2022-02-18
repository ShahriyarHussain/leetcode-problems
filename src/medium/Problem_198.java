package medium;

public class Problem_198 {

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,1,1,2}));
    }

    public static int rob(int[] nums) {

        if (nums.length < 2) {
            return nums[0];
        }

        int globalMax = 0;
        int variation1Robbed = 0;
        int variation2Robbed = 0;

        for (int i = 0, j = 1;; i += 2, j +=2) {

            if (i >= nums.length && j >= nums.length) {
                break;
            }

            if (i < nums.length) {
                variation1Robbed += nums[i];
            }

            if (j < nums.length) {
                variation2Robbed += nums[j];
            }

            globalMax = Integer.max(variation1Robbed, variation2Robbed);
        }

        return globalMax;
    }

}
