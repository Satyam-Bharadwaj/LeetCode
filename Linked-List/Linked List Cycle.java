/**
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
 * Check if there is a cycle in LL using 2 pointer method.
 */

 /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        
        ListNode fastP = head;
        ListNode slowP = head;
        
        while(fastP.next!=null && fastP.next.next!=null ){
            fastP=fastP.next;
            if(fastP.equals(slowP))return true;
            fastP=fastP.next;
            if(fastP.equals(slowP))return true;
            slowP=slowP.next;
        }
        return false;
    }
}