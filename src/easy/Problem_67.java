package easy;

public class Problem_67 {
    /*
    Name: Add Binary
    Difficulty: Easy
    Link: https://leetcode.com/problems/add-binary/
     */

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        String min = "", max = "";

        if (a.length() > b.length()) { min = b;max = a; }
        else { min = a; max = b; }

        int diff = 0, carry = 0;
        diff = max.length() - min.length();

        for (int i = max.length() - 1; i > -1; i--) {
            int sum = 0;
            if (i - diff < 0) {
                sum = ((max.charAt(i) - 48)  + carry);
            } else {
                sum = (((max.charAt(i) - 48) + (min.charAt(i - diff) - 48)) + carry);
            }
            carry = sum / 2;
            result.append(sum % 2);
        }

        if (carry != 0) result.append(carry);
        return result.reverse().toString();
    }

//    public static void main(String[] args) {
//        System.out.println(addBinary("100","110010"));
//    }
}
