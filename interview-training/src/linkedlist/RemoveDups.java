package linkedlist;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDups {

    public static void removeDups(LinkedListNode node){
        Set<Integer> set = new HashSet<>();
        LinkedListNode previous = null;
        while(node != null){
            if(set.contains(node.data)){
               previous.next = node.next;
            }else{
                set.add(node.data);
                previous= node;
            }
            node = node.next;
        }
    }


    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(4);
        removeDups(head);
        LinkedListNode.printLinkedList(head);
    }
}
