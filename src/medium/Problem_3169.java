package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

public class Problem_3169 {

    /*
    Name: Count Days Without Meetings
    Difficulty: Medium
    Link: https://leetcode.com/problems/count-days-without-meetings/
    */

    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int freeDays = meetings[0][0] - 1;
        int day = meetings[0][1] + 1;

        for (int index = 1; index < meetings.length; index++) {
            if (day > meetings[index][0] && day > meetings[index][1]) {
                continue;
            }
            if (day >= meetings[index][0] && day <= meetings[index][1]) {
                day = meetings[index][1] + 1;
                continue;
            }
            freeDays += meetings[index][0] - day;
            day = meetings[index][1] + 1;
        }
        freeDays += (days - day) + 1;
        return freeDays;
    }

}
