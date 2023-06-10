package easy;

public class Problem_191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(521));
    }
    public static int hammingWeight(int n) {
        int numOfBits = 0;
        String bits = Integer.toBinaryString(n);
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                numOfBits++;
            }
        }
        return numOfBits;
    }
}
