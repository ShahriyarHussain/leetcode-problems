package medium;


public class Problem_2095 {
    public ListNode deleteMiddleNode(ListNode head) {
        int lengthOfList = 0;

        for (ListNode start = head; start != null; start = start.next) {
            lengthOfList++;
        }

        int middleNode = lengthOfList / 2;

        ListNode start = head;

        for (int i = 0; i < middleNode; i++) {
            start = start.next;
        }

        if (start.next == null) {
            return null;
        }
        if (start.next.next != null) {
            start.next = start.next.next;
            return head;
        }
        start.next = null;
        return head;
    }
}
