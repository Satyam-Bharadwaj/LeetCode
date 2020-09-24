/**
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/
 * 
 * find intersection node of two linked lists
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; next = null; } }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        int len1 = 0;
        int len2 = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA.next != null) {
            tempA = tempA.next;
            len1++;
        }
        while (tempB.next != null) {
            tempB = tempB.next;
            len2++;
        }
        if (tempA != tempB)
            return null;
        int diff = Math.abs(len1 - len2);

        tempA = headA;
        tempB = headB;
        if (len1 > len2) {
            while (diff > 0) {
                tempA = tempA.next;
                diff--;
            }
        } else if (len1 < len2) {
            while (diff > 0) {
                tempB = tempB.next;
                diff--;
            }
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;

    }
}
