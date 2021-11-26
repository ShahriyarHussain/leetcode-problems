package easy;

public class Problem_53 {

    /*
    Name: Maximum Subarray
    Difficulty: Easy
    Link: https://leetcode.com/problems/maximum-subarray/
     */

    public int maxSubArray(int[] nums) {
       int globalMaxSum, currentMaxSum;
       globalMaxSum = currentMaxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMaxSum = Integer.max(currentMaxSum + nums[i], nums[i]);
            globalMaxSum = Integer.max(globalMaxSum, currentMaxSum);
        }
       return globalMaxSum;
    }

//        public static void main(String[] args) {
//        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(maxSubArray(array));
//    }
}
