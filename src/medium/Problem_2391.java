package medium;

import java.util.HashMap;
import java.util.Map;

public class Problem_2391 {
    public int garbageCollection(String[] garbage, int[] travel) { // O (N*M)
        int totalTime = 0;
        Map<Character, Integer> garbageIndexMap = new HashMap<>();
        //Collecting last house index of garbage type in a map and also counting num of garbage
        for (int j = 0; j < garbage.length; j++) { // O(N*M) where M is max garbage in a house
            for (char i : garbage[j].toCharArray()) {
                garbageIndexMap.put(i, j);
                totalTime++;
            }
        }

        //An array to map house index with time to reach that house from first house
        int timeSum = 0;
        int[] timeSumArray = new int[travel.length + 1];
        for (int i = 0; i < travel.length; i++) { // O(N)
            timeSum += travel[i];
            timeSumArray[i + 1] = timeSum;
        }

        //calculating total
        for (char item : garbageIndexMap.keySet()) { // O(N)
            totalTime += timeSumArray[garbageIndexMap.get(item)];
        }
        return totalTime;
    }
}
