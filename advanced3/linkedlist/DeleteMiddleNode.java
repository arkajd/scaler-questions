package advanced3.linkedlist;

// Given a singly linked list, delete middle of the linked list.
// For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5
// If nodes are even, consider the second middle node.

public class DeleteMiddleNode {

    public static LinkedListNode deleteMiddleNode(LinkedListNode head){
        if(head==null){
            return null;
        }
        LinkedListNode temp = new LinkedListNode(0, head);
        LinkedListNode slowPointer = temp;
        LinkedListNode fastPointer = head;

        while(fastPointer!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(fastPointer!=null && fastPointer.next==null){
                break;
            }
        }
        slowPointer.next = slowPointer.next.next;
        return head;
    }
    
}
