package easy;

public class Problem_977 {

    /*
    Name: Squares of a Sorted Array
    Difficulty: Easy
    Link: https://leetcode.com/problems/squares-of-a-sorted-array/
    */

    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        java.util.Arrays.sort(nums);

        return nums;
    }

}
