package easy;

import java.util.Arrays;

public class Problem_88 {

    /*
    Name: Merge Sorted Array
    Difficulty: Easy
    Link: https://leetcode.com/problems/merge-sorted-array/
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}
