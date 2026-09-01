// Last updated: 1/9/2026, 12:42:50 pm
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
    public ListNode insertionSortList(ListNode head) {
        ListNode  temp = new ListNode(-1);
        ListNode  current =head;
        while(current != null){
            ListNode nextnode=current.next;
            ListNode prev=temp;
            while(prev.next !=null && prev.next.val<current.val){
                prev =prev.next;
            }
            current.next=prev.next;
            prev.next=current;
            current =nextnode;
        }
        return temp.next;
        
    }
}