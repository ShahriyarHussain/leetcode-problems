package easy;

public class Problem_1528 {
    public String restoreString(String s, int[] indices) {
        char[] array = new char[s.length()];
        String restoredString = "";

        for (int i = 0; i < indices.length; i++) {
            array[indices[i]] = s.charAt(i);
        }

        for (char c : array) {
            restoredString += c;
        }

        return restoredString;
    }
}
