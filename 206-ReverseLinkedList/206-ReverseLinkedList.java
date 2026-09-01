// Last updated: 1/9/2026, 12:42:27 pm
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
    public ListNode reverseList(ListNode head) {
        ListNode node=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=node;
            node=head;
            head=temp;
        }
    return node;
        
    }
}