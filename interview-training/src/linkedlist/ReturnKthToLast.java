package linkedlist;

public class ReturnKthToLast {

    public static LinkedListNode returnKthToLast(LinkedListNode node,int count){
        LinkedListNode newLinkedList=null;
        for(int i=0; i< count-1;i++){
            node=node.next;
        }
        newLinkedList = node.next;
        return newLinkedList;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(4);

        LinkedListNode.printLinkedList( returnKthToLast(head,3));
    }
}
