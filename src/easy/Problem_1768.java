package easy;

public class Problem_1768 {
    public String mergeAlternately(String word1, String word2) {
        String remainingChars;
        int minimumLength;
        StringBuilder merged = new StringBuilder();

        if (word1.length() > word2.length()) {
            remainingChars = word1.substring(word2.length());
            minimumLength = word2.length();
        } else {
            remainingChars = word2.substring(word1.length());
            minimumLength = word1.length();
        }

        for (int i = 0; i < minimumLength; i++) {
            merged.append(word1.charAt(i)).append(word2.charAt(i));
        }
        merged.append(remainingChars);
        return merged.toString();
    }
}
