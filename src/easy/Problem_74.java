package easy;

public class Problem_74 {
    /*
    Name: Climbing Stairs
    Difficulty: Easy
    Link: https://leetcode.com/problems/climbing-stairs/
     */

    public int climbStairs(int n) {
        return fibonacci(1, 1, n);
    }

    public int fibonacci(int o, int n, int s) {
        if (s == 1) return n;
        return fibonacci(n, o+n, --s);
    }
}
