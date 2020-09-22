/**
 * https://leetcode.com/explore/learn/card/linked-list/209/singly-linked-list/1290/ 
 * 
 * Design a linked list
 * Note: Easier implementation is with using head and tail as individual nodes, making it 
 * easier to operate. I wanted to challenge myself with head and tail being actual elements of the list.
 * 
 */

 class MyLinkedList {
    class DLLNode{
        int val;
        DLLNode prev;
        DLLNode next;
        
        public DLLNode(int val,DLLNode prev,DLLNode next){
            this.val = val;
            this.prev=prev;
            this.next=next;
        }
    }
    DLLNode head;
    DLLNode tail;
    long size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head=null;
        tail=null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=size) return -1;
        
        
        //Lookup if closer from head
        DLLNode idxNode=  getNodeAtIndex(index);
        return idxNode.val;
        
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(head==null){
            head = new DLLNode(val,null,null);
            tail = head;
            size++;
            return;
        }
        DLLNode valueNode = new DLLNode(val,null,head);
        head.prev=valueNode;
        head = valueNode;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(tail == null){
            tail = new DLLNode(val,null,null);
            head =tail;
            size++;
            return;
        }
        DLLNode valueNode = new DLLNode(val,tail,null);
        tail.next=valueNode;
        tail = valueNode;
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
       //Head position addition
        if(index==0){
            addAtHead(val);
            return;
        }
        //Addition anywhere in between head and tail
         if(index<size){
            DLLNode idxNode=getNodeAtIndex(index);
            // System.out.println(idxNode.val+":"+idxNode.prev+":"+idxNode.next);
            DLLNode valueNode= new DLLNode(val,idxNode.prev,idxNode);
            
            idxNode.prev.next=valueNode;
            idxNode.prev=valueNode;
              size++;
            return;
        }
        //Addition on tail
         if(index==size){
            addAtTail(val);
        }
       

      
        
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
       //delete first node (head) handle head pointer movement
        if(index==0){
            DLLNode temp = head;
            head=head.next;
            temp.next=null;
            if(head!=null)head.prev=null;
            size--;
            return;
        }
        // delete non head and non tail node
         if(index<size-1){
            DLLNode idxNode= getNodeAtIndex(index);
            idxNode.prev.next= idxNode.next;
            idxNode.next.prev=idxNode.prev;
            size--;
            return;
         }
        // delete tail node
        if (index<size){
            DLLNode temp = tail;
            tail=tail.prev;
            temp.prev=null;
            if(tail!=null)tail.next=null;
            
            size--;
        }
        
        
    }
    
    //Returns node at index idx assuming it is valid node
    private DLLNode getNodeAtIndex(int idx){
       
        int counter  =0;
        DLLNode current=head;
        while(counter<idx){
            current=current.next;
            counter++;
        }
                

        return current;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */