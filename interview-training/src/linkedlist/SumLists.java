package linkedlist;

public class SumLists {

    public static LinkedListNode sumLists(LinkedListNode list1, LinkedListNode list2){
        LinkedListNode newHead = new LinkedListNode();
        LinkedListNode temp = newHead;
        int carry = 0;
        while(list1 != null || list2 != null || carry ==1){
            int sum = 0;
            if(list1 != null){
                sum+= list1.data;
                list1 = list1.next;
            }
            if(list2 != null){
                sum += list2.data;
                list2 = list2.next;
            }
            sum += carry;
            carry = sum/10;
            LinkedListNode node = new LinkedListNode(sum%10);
            temp.next = node;
            temp= temp.next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        LinkedListNode list1 = new LinkedListNode(7);
        list1.appendToTail(1);
        list1.appendToTail(6);
        LinkedListNode list2 = new LinkedListNode(5);
        list2.appendToTail(9);
        list2.appendToTail(2);

        LinkedListNode.printLinkedList(sumLists(list1,list2));
    }
}
