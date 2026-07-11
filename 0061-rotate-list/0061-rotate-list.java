/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
    return head;
        ListNode curr=head;
        int count=0;
        while(curr.next!=null){
        curr=curr.next;
        count++;
        }
        count++;
        int r=k%count;
        if(r==0) return head;
        ListNode pnull=head;
        ListNode next=head;
        int i=0;
        while(i<count-r-1){
            pnull=pnull.next;
            i++;
        }
        next=pnull.next;
        pnull.next=null;
        curr.next=head;
        return next;

        
    }
}