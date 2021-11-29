package easy;

public class problem_1672 {

    /*
    Name: Richest Customer Wealth
    Difficulty: Easy
    Link: https://leetcode.com/problems/richest-customer-wealth/
     */

//    public static void main(String[] args) {
//        System.out.println(maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}}));
//    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int currentMax = 0;
            for (int wealth : account) {
                currentMax += wealth;
            }
            if (currentMax > maxWealth) maxWealth = currentMax;
        }
        return maxWealth;
    }
}
