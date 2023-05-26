https://leetcode.com/problems/merge-two-sorted-lists/

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
       ListNode firstMerge = null;
       ListNode merge = null;
       while (list1 != null || list2 != null){
            if (merge == null) {
                merge = new ListNode();
                firstMerge = merge;
            } else {
                merge.next = new ListNode();
                merge = merge.next;
            }
            if (list1 != null && (list2 == null || list1.val <= list2.val)) {
                merge.val = list1.val;
                list1 = list1.next;
            } else {
                merge.val = list2.val;
                list2 = list2.next;
            }
        }

        return firstMerge;
    }
}