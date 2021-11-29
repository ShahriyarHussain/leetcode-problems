package easy;

public class Problem_1929 {

    /*
    Name: Concatenation of Array
    Difficulty: Easy
    Link: https://leetcode.com/problems/concatenation-of-array/
     */

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < ans.length; i++)
            ans[i] = nums[i% nums.length];

        return ans;
    }
}
