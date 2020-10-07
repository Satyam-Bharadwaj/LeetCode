/**
 * 
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3486/
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;
        ListNode kNode = head;
        ListNode lastNode = head;
        ListNode sizeCalc = head;
        //calculate the size of list
        int size = 0;
        while (sizeCalc != null) {
            sizeCalc = sizeCalc.next;
            size++;
        }
        // k can be greater than size so we need effective rotations.
        int i = k % size;
        // no rotations required if 0 rotations
        if (i == 0)
            return head;
        while (i > 0 && lastNode.next != null) {
            i--;
            lastNode = lastNode.next;
        }
        if (i != 0)
            return head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            kNode = kNode.next;
        }
        ListNode newStart = kNode.next;
        kNode.next = null;
        lastNode.next = head;
        return newStart;


    }

    // Can be done using reverse as well
    // reverse first k, reverse last k , reverse whole list

    // private ListNode reverse(ListNode head){
    // if(head ==null)return head;
    // if(head.next==null)return head;
    // ListNode prev = reverse(head.next);
    // head.next.next =head;
    // head.next = null;
    // return prev;
    // }
}
