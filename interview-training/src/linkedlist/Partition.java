package linkedlist;

public class Partition {

   public static LinkedListNode partition(LinkedListNode head, int x){
       LinkedListNode left =new LinkedListNode();
       LinkedListNode right = new LinkedListNode();
       LinkedListNode ltail = left;
       LinkedListNode rtail = right;

       while(head != null){
           if(head.data <x){
               ltail.next = head;
               ltail = ltail.next;
           }else{
               rtail.next = head;
               rtail = rtail.next;
           }
           head = head.next;
       }
       ltail.next = right.next;
       rtail.next = null;
       return ltail.next;
   }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(3);
        head.appendToTail(5);
        head.appendToTail(8);
        head.appendToTail(5);
        head.appendToTail(10);
        head.appendToTail(2);
        head.appendToTail(1);
        LinkedListNode.printLinkedList(head);
        partition(head, 5);
        System.out.println("");
        LinkedListNode.printLinkedList(head);
    }
}
