package easy;

public class Problem_35 {

    public static void main(String[] args) {
        int[] array = {1};
        System.out.println(searchInsert(array, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int mid = low + (high - low)/2;

        while (true) {
            if (high < low) return mid;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) low = mid + 1;
            else if (target < nums[mid]) high = mid - 1;
            mid = low + (high - low)/2;
        }

    }
}
