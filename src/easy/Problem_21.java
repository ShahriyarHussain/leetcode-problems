package easy;

public class Problem_21 {

    /*
    Problem Name: Merge two sorted lists
    Difficulty: Easy
    link: https://leetcode.com/problems/merge-two-sorted-lists
     */

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode tail;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val <= l2.val) {
            head = tail = l1;
            l1 = l1.next;
        }
        else {
            head = tail = l2;
            l2 = l2.next;
        }
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) tail.next = l2;
        if (l2 == null) tail.next = l1;
        return head;
    }
}

//The ListNode Class is given in Leetcode and no need to implement it.
//Only uncomment if testing the code in local machine