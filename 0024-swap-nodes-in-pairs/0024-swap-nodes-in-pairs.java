class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = head.next;
        ListNode prev = null;

        while (head != null && head.next != null) {

            ListNode first = head;
            ListNode second = head.next;

            // Swap
            first.next = second.next;
            second.next = first;

            // Connect previous pair to current pair
            if (prev != null) {
                prev.next = second;
            }

            // Move to next pair
            prev = first;
            head = first.next;
        }

        return dummy;
    }
}
