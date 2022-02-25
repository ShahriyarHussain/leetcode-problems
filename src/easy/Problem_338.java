package easy;

    /*
    Name: Counting Bits
    Difficulty: Easy
    Link: https://leetcode.com/problems/counting-bits/
    */

public class Problem_338 {
    public static void main(String[] args) {
        int[] array = countBits(5);
        System.out.print("[");
        for (int i : array) {
            System.out.printf("%d,", i);
        }
        System.out.print("]");
    }
    public static int[] countBits(int n) {
        n = n + 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(i);
            int numberOfOnes = 0;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    numberOfOnes++;
                }
            }
            array[i] = numberOfOnes;
        }
        return array;
    }
}
