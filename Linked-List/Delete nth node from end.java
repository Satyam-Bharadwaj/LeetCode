/**
 *  https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1296/
 *  Core logic : Move fast pointer n places then move both slow and fast pointer to end of list.
 *  delete slow pointer node.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Idea is to advance n nodes on fp and then move each fp and sp by 1
        ListNode fp = head;
        ListNode sp = head;
        if(head ==null)return head;
        while(n>0){
            n--;
            fp=fp.next;
        }
        ListNode prev= sp;
        while(fp!=null){
            fp=fp.next;
            prev=sp;
            sp=sp.next;
        }
        if(sp!=head){
            prev.next = sp.next;
            sp.next=null;
        }else{
            head=sp.next;
            sp.next=null;
        }
        return head;
        
    }
}