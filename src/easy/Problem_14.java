package easy;

class Problem_14 {

    /*
    Name: Longest Common Prefix
    Difficulty: Easy
    Link: https://leetcode.com/problems/longest-common-prefix/
     */

//

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String longestPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(longestPrefix) != 0) {
                longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
                if (longestPrefix.isEmpty()) return "";
            }
        }
        return longestPrefix;
    }

//    public static void main(String[] args) {
//        String[] array = {"dog","racecar","car"};
//        System.out.println(longestCommonPrefix(array));
//    }
}
