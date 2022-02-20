package easy;

import java.util.Locale;

public class Problem_125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        String cleanedString = s.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
        for (int i = 0, j = cleanedString.length() - 1; i < j ; i++, j--) {
            if (cleanedString.charAt(i) != cleanedString.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
