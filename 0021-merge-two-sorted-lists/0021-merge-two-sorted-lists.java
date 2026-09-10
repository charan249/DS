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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode h1=list1;
        ListNode h2=list2;
        
        List<Integer> list=new ArrayList<>();

        while(h1!=null){
            list.add(h1.val);
            h1=h1.next;
        }
         while(h2!=null){
            list.add(h2.val);
            h2=h2.next;
        }

        Collections.sort(list);

        ListNode ans=new ListNode(0);
        ListNode anshead=ans;

        for(int i=0;i<list.size();i++){
         ListNode n=new ListNode(list.get(i));
         ans.next=n;
         ans=ans.next;
        }
        return anshead.next;
    }
}