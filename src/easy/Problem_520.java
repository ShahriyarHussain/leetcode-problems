package easy;

public class Problem_520 {

    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) {
            return true;
        }
        if (word.charAt(1) < 'a' && word.charAt(0) < 'a') {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) > 'Z') {
                    return false;
                }
            }
            return true;
        }
        if (word.charAt(1) > 'Z') {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) < 'a') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
