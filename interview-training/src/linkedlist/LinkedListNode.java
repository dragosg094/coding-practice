package linkedlist;

import org.w3c.dom.Node;

public class LinkedListNode {
    LinkedListNode next;
    int data;

    public LinkedListNode(int data) {
        this.data = data;
        next = null;
    }
    public LinkedListNode() {
        this.data = 0;
        next = null;
    }
    public void appendToTail(int data){
        LinkedListNode end = new LinkedListNode(data);
        LinkedListNode n = this;
        while(n.next!= null){
            n = n.next;
        }
        n.next = end;
    }

    public LinkedListNode deleteNode(LinkedListNode head, int data) {
        LinkedListNode n = head;
        if (n.data == data) {
            return head.next;
        }
        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
    public static void printLinkedList(LinkedListNode node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}
