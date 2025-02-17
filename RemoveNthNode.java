class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
            return null;
        ListNode curr = head;
        int size = 0;

        while(curr != null) //calculating size
        {
            size++;
            curr = curr.next;
        }

        if(n == size)   //if we want to delete first node
            return head.next;

        ListNode now = head;
        int k = 1;

        while(k < size - n) //Making position to previous node of removing node
        {
            now = now.next;
            k++;
        }

        now.next = now.next.next;

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.println("After removing 2nd node from end:");
        printList(head);
    }
}
