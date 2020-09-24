/**
 * 
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1207/
 */


/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode headNew = null;
        ListNode headNewcurr = null;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val != val) {
                if (headNew == null) {
                    headNew = curr;
                    headNewcurr = headNew;
                } else {
                    headNewcurr.next = curr;
                    headNewcurr = headNewcurr.next;

                }
            }
            ListNode temp = curr;
            curr = curr.next;
            temp.next = null;

        }
        return headNew;
    }
}
