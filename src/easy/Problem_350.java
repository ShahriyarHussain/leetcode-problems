package easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Problem_350 {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();

        for (int k : nums1) {
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }
        }

        for (int j : nums2) {
            if (map.containsKey(j)) {
                if (map.get(j) > 0) {
                    list.add(j);
                    map.put(j, map.get(j) - 1);
                }
            }
        }

        int[] results = new int[list.size()];
        for (int i = 0; i < results.length; i++) {
            results[i] = list.get(i);
        }

        return results;
    }
}
