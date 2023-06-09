package medium;

import java.util.HashSet;
import java.util.Set;

public class Problem_142 {
    /*
    Name: Linked List Cycle II
    Difficulty: Medium
    Link: https://leetcode.com/problems/linked-list-cycle-ii/
    */

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();

        for(ListNode start =  head; start != null; start = start.next) {
            if (nodes.contains(start)) { return start; }
            nodes.add(start);
        }
        return null;
    }
}
