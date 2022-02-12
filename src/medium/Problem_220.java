package medium;

import java.util.TreeSet;

/*
    Name: Contains Duplicate III
    Difficulty: Medium
    Link: https://leetcode.com/problems/contains-duplicate-iii/
*/

public class Problem_220 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        TreeSet<Long> treeSet = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            Long floor = treeSet.floor((long)(nums[i]));
            if (floor != null && nums[i] - floor <= t) {
                return true;
            }

            Long ceil = treeSet.ceiling((long)(nums[i]));
            if (ceil != null && ceil - nums[i] <= t ) {
                return true;
            }

            treeSet.add((long)nums[i]);
            if (treeSet.size() > k) {
                treeSet.remove((long)nums[i-k]);
            }
        }

        return false;
    }

}
