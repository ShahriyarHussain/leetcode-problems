package easy;

public class Problem_2011 {

    /*
    Name:  Final Value of Variable After Performing Operations
    Difficulty: Easy
    Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
     */

//    public static void main(String[] args) {
//        System.out.println(finalValueAfterOperations(new String[]{"++X","X++","X++"}));
//
//    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s: operations) {
            if (s.charAt(0) == '+' || s.charAt(s.length()-1) == '+') x++;
            else x--;
        }
        return x;
    }
}
