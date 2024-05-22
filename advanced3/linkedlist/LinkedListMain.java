package advanced3.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(1, null);
        LinkedListNode node2 = new LinkedListNode(2, null);
        LinkedListNode node3 = new LinkedListNode(3, null);
        LinkedListNode node4 = new LinkedListNode(4, null);
        LinkedListNode node5 = new LinkedListNode(5, null);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        LinkedListNode newHead = DeleteMiddleNode.deleteMiddleNode(node1);
        printLinkedList(newHead);
    }

    private static void printLinkedList(LinkedListNode head){
        if(head==null){
            System.out.println("Linked List empty.");
        }
        LinkedListNode current = head;

        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
}
