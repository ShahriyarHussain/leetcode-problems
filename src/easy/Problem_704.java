package easy;

/*
    Name: Binary Search
    Difficulty: Easy
    Link: https://leetcode.com/problems/binary-search/
*/

public class Problem_704 {

    //O(logn)
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end- start)/2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
