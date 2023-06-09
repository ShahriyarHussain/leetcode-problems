package easy;

public class Problem_744 {
    public static char nextGreatestLetter2(char[] letters, char target) {
        char minChar = 255;
        for (char letter : letters) {
            if (target < letter && letter < minChar) {
                minChar = letter;
            }
        }
        if (minChar == 255) {
            return letters[0];
        }
        else {
            return minChar;
        }
    }
}
