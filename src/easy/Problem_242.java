package easy;

import java.util.HashMap;
import java.util.Map;

public class Problem_242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> stringMap = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (stringMap.containsKey(s.charAt(i))) {
                stringMap.put(s.charAt(i), stringMap.get(s.charAt(i)) + 1);
                continue;
            }
            stringMap.put(s.charAt(i), 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (stringMap.containsKey(t.charAt(i))) {
                if (stringMap.get(t.charAt(i)) < 1) {
                    return false;
                }
                stringMap.put(t.charAt(i), stringMap.get(t.charAt(i)) - 1);
                continue;
            }
            return false;
        }
        return true;
    }
}
