package medium;

import java.util.HashMap;
import java.util.Map;

public class Problem_3 {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int longestSubstringLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                longestSubstringLength = Integer.max(longestSubstringLength, map.size());
                i = map.get(s.charAt(i)) + 1;
                map.clear();
            }
            map.put(s.charAt(i), i);
        }
        longestSubstringLength = Integer.max(longestSubstringLength, map.size());

        return longestSubstringLength;
    }
}
