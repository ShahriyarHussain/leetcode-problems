package easy;

import java.util.Arrays;

public class Problem_27 {

    /*
    Name: Remove Element From Sorted Array
    Difficulty: Easy
    Link: https://leetcode.com/problems/remove-element/
     */

    public int removeElement(int[] nums, int val) {
        if (val > 50) return nums.length;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
