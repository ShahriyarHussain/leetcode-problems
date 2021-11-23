import java.util.HashMap;
import java.util.Map;

class Solution {

    /*
    Problem Name: Roman Integers
    link: https://leetcode.com/problems/roman-to-integer/
     */

    public static final HashMap<Character, Integer> romans = new HashMap<Character, Integer>(Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    ));

    public int romanToInt(String s) {
        int intValue = romans.get(s.charAt(0));
        int prev = intValue;
        for (int i = 1; i < s.length(); i++) {
            int now = romans.get(s.charAt(i));
            if (now > prev) intValue +=  now - 2*prev;
            else intValue += now;
            prev = now;
        }
        return intValue;
    }
}