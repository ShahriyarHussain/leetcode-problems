package easy;

class Solution {
    public int maximumCount(int[] nums) {
        if ((nums[0] < 0 && nums[nums.length - 1] < 0) ||
                (nums[0] > 0 && nums[nums.length - 1] > 0)) {
            return nums.length;
        }

//        for (int i = 0, j = nums.length - 1; j > -1 && i < nums.length; i++, j--) {
//
//        }
        int zeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zeroIndex == -1) {
                zeroIndex = i;
                continue;
            }
            if (nums[i] > 0) {
                return Math.max(i+1 - zeroIndex, nums.length - (i+1 -zeroIndex));
            }
        }
        return zeroIndex;
    }
}
