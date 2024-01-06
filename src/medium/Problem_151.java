package medium;

public class Problem_151 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i > -1; i--) {
            if (words[i].isEmpty()) continue;
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}
