package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem_56 {

     /*
    Name: Merge Intervals
    Difficulty: Medium
    Link: https://leetcode.com/problems/merge-intervals/
    */

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> mergedIntervals = new ArrayList<>();

        int pointer = intervals[0][1];
        int start = intervals[0][0];
        for (int index = 1; index < intervals.length; index++) {
            if (pointer < intervals[index][0]) {
                mergedIntervals.add(new int[]{start, pointer});
                start = intervals[index][0];
            }
            pointer = Math.max(pointer, intervals[index][1]);
        }
        mergedIntervals.add(new int[]{start, pointer});

        int[][] nonOverlappingIntervals = new int[mergedIntervals.size()][2];
        for (int i = 0; i < mergedIntervals.size(); i++) {
            nonOverlappingIntervals[i][0] = mergedIntervals.get(i)[0];
            nonOverlappingIntervals[i][1] = mergedIntervals.get(i)[1];
        }
        return nonOverlappingIntervals;
    }

}
