package easy;

public class Problem_69 {

    /*
    Name: Sqrt(x)
    Difficulty: Easy
    Link: https://leetcode.com/problems/sqrtx/
     */

//    public static void main(String[] args) { System.out.println(mySqrt(12)); }

    public int mySqrt(int x) {
//        return (int)Math.floor(Math.sqrt(x));
        int root = 0;
        for (int i = 1; x > 0; i += 2,root++) x -= i;
        return x == 0 ? root:root-1;
    }


}
