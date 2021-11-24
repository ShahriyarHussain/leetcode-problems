package easy;

import java.util.Arrays;

public class Problem_26 {

    /*
    Name: Remove Duplicates From Sorted Array
    Difficulty: Easy
    Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     */

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }

//    public static void main(String[] args) {
//        int[] array = {1,1,2};
//        System.out.println(removeDuplicates(array));
//        for (int i:array) {
//            System.out.println(i);
//        }
//    }

}
