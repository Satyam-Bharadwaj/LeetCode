/**
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1227/
 * 
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode head = new ListNode();
        ListNode curr = head;
        while (l2 != null && l1 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        while (l1 != null) {
            curr.next = l1;
            curr = curr.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            curr.next = l2;
            curr = curr.next;
            l2 = l2.next;
        }
        curr.next = null;
        return head.next;
    }
}
