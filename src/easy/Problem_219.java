package easy;

/*
    Name: Contains Duplicate II
    Difficulty: Easy
    Link: https://leetcode.com/problems/contains-duplicate-ii/
*/
import java.util.*;

public class Problem_219 {

    public static boolean containsNearByDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
