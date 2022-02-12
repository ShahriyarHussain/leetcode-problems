package easy;

/*
    Name: Fibonacci Number
    Difficulty: Easy
    Link: https://leetcode.com/problems/fibonacci-number/
*/

public class Problem_509 {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
