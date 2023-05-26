// https://leetcode.com/problems/reverse-linked-list/

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
        if(head == null || head.next == null)
            return head;

        ListNode prevHead = head;
        head = head.next;
        prevHead.next = null;

        while (head != null) {
            var nextHead = head.next;
            head.next = prevHead;
            prevHead = head;
            head = nextHead;
        }

        return prevHead;
    }
}