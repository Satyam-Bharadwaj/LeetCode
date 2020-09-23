/**
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1208/
 * 
 */

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
    public ListNode oddEvenList(ListNode head) {
    
        ListNode odd= new ListNode();
        ListNode even = new ListNode();
        ListNode oddList =odd;
        ListNode evenList =even;
        ListNode curr = head;
        int nodeNum=0;
        while(curr!=null){
            if(nodeNum%2!=0){
                evenList.next =curr;
                evenList=evenList.next;
                
            }
            else{
                oddList.next=curr;
                oddList=curr;
                
            }
            curr=curr.next;
            nodeNum++;
        }
        evenList.next=null;
        oddList.next=even.next;
        head= odd.next;
        return head;
        
    }
}