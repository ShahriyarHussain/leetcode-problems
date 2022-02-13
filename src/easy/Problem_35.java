package easy;

public class Problem_35 {

    /*
    Name: Search Insert Position
    Difficulty: Easy
    Link: https://leetcode.com/problems/search-insert-position/
     */

    public int searchInsert(int[] nums, int target) {

        int start = 0, end = nums.length - 1,  mid = start + (end - start)/2;

        while (start <= end) {

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }

        return mid;
    }
}
