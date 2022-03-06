package easy;

public class Problem_876 {

    public ListNode middleNode(ListNode head) {
        int length = 0;

        for (ListNode start = head; start != null; start = start.next) {
            length++;
        }

        length /= 2;
        for (ListNode start = head;; start = start.next) {
            if (length == 0) {
                return start;
            }
            length--;
        }
    }
}
