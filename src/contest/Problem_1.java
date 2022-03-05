package contest;

import java.util.HashMap;
import java.util.Map;

public class Problem_1 {
    public static void main(String[] args) {
        System.out.println(mostFrequent(new int[]{2,1000,2,1000,2,3}, 2));
    }

    public static int mostFrequent(int[] nums, int key) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                if (frequency.containsKey(nums[i+1])) {
                    frequency.put(nums[i+1], frequency.get(nums[i+1])+1);
                } else {
                    frequency.put(nums[i+1], 1);
                }
            }
        }
        int maxOccurrence = Integer.MIN_VALUE;
        int maxOccurrenceVal = 0;
        for (Map.Entry pairs : frequency.entrySet()) {
            int pairKey = Integer.parseInt(pairs.getKey().toString());
            int pairVal = Integer.parseInt(pairs.getValue().toString());

            if (pairVal > maxOccurrence) {
                maxOccurrence = pairKey;
                maxOccurrenceVal = pairKey;
            }
        }
        return maxOccurrenceVal;
    }
}
