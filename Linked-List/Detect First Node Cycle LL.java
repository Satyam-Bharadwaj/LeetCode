/**
 * 
 * https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1214/
 * Reference for mathematics involved: https://www.geeksforgeeks.org/find-first-node-of-loop-in-a-linked-list/
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
    public ListNode detectCycle(ListNode head) {
        if(head==null)return null;
        
        ListNode fastP = head;
        ListNode slowP = head;
        
        while(fastP.next!=null && fastP.next.next!=null ){
            fastP=fastP.next.next;
            slowP=slowP.next;
            if(fastP.equals(slowP)){
                 slowP=head;
                 while(slowP!=fastP){
                 slowP=slowP.next;
                 fastP=fastP.next;
                }
        if(slowP==fastP)return slowP;
         }
            
        }
        return null;
    }
}