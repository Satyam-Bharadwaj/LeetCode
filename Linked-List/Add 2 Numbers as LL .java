/**
 * 
 * 
 * https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1228/
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode head = new ListNode();
        ListNode curr = head;
        while (ptr1 != null && ptr2 != null) {
            int sum = ptr1.val + ptr2.val + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

        }
        while (ptr1 != null) {
            int sum = ptr1.val + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            ptr1 = ptr1.next;
        }
        while (ptr2 != null) {
            int sum = ptr2.val + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            ptr2 = ptr2.next;
        }
        if (carry == 1) {
            curr.next = new ListNode(carry);
        }
        return head.next;
    }

}
