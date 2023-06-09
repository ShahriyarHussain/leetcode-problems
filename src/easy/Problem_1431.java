package easy;

import java.util.ArrayList;
import java.util.List;

public class Problem_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNumOfCandy = 0;
        List<Boolean> results = new ArrayList<>(candies.length);
        for (int i : candies) {
            if (i > maxNumOfCandy) {
                maxNumOfCandy = i;
            }
        }

        for (int i : candies) {
            results.add((i+extraCandies) >= maxNumOfCandy);
        }
        return results;
    }
}
