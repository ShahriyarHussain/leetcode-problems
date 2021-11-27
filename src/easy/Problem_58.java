package easy;

import java.util.regex.Pattern;

public class Problem_58 {

    /*
    Name: Length of Last Word
    Difficulty: Easy
    Link: https://leetcode.com/problems/length-of-last-word/
     */

    public int lengthOfLastWord(String s) {
        String[] array = s.trim().split(" ");
        return array[array.length - 1].length();
    }

//    public static void main(String[] args) {
//        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
//    }
}
