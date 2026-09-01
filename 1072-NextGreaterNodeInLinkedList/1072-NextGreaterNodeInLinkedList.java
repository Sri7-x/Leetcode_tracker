// Last updated: 1/9/2026, 12:41:28 pm
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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        int[] nextGreater = new int[size];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = size - 1; i >= 0; i--) {
            int ele = list.get(i);
            while (!stack.isEmpty() && stack.peek() <= ele)
                stack.pop();
            if (stack.isEmpty())
                nextGreater[i] = 0;
            else
                nextGreater[i] = stack.peek();
            stack.push(ele);
        }
        return nextGreater;
    }
}