package easy;

/*
    Name: N-th Tribonacci Number
    Difficulty: Easy
    Link: https://leetcode.com/problems/n-th-tribonacci-number/
*/

public class Problem_1137 {

    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }

    public static int tribonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
}
