// Last updated: 1/9/2026, 12:43:31 pm
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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next==null) return null;
        ListNode fast=head,start=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;}
            while(fast!=null&&fast.next!=null)
        {
            start=start.next;
            fast=fast.next;

        }start.next=start.next.next;
        return head;
    }
}