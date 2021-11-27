package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Problem_66 {

    /*
    Name: Plus One
    Difficulty: Easy
    Link: https://leetcode.com/problems/plus-one/
     */

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigit = new int[digits.length+1];
        newDigit[0] = 1;
        return newDigit;
    }

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,9,9})));
//    }

}
