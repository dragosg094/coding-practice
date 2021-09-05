package linkedlist;

public class DeleteMiddleNode {
   public static boolean deleteNode(LinkedListNode n) {
        if (n == null || n.next == null) {
            return false;
        }
        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.appendToTail(2);
        head.appendToTail(1);
        head.appendToTail(3);
        head.appendToTail(4);
        LinkedListNode.printLinkedList(head);
        System.out.println( deleteNode(head.next.next));
        LinkedListNode.printLinkedList(head);
    }

}
