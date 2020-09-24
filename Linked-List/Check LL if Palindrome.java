/**
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1209/
 * 
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;
        while (fast != null && slow != null) {
            if (fast.val != slow.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    ListNode reverse(ListNode head) {

        if (head.next == null)
            return head;

        ListNode reversed = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;

    }
}
