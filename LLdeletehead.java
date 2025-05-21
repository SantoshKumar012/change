import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

class LLdeletehead {
    public ListNode deleteHead(ListNode head) {
        if (head == null) 
            return null;
            ListNode temp = head;
            head = head.next;
            temp = null;        
            return head;
    }
}

class Main {
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode insertAtHead(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    
    public static void main(String[] args) {
        ListNode head = null;
        head = insertAtHead(head, 3);
        head = insertAtHead(head, 2);
        head = insertAtHead(head, 1);

        System.out.print("Original list: ");
        printList(head);
        LLdeletehead sol = new LLdeletehead();
        head = sol.deleteHead(head);

        System.out.print("List after deleting head: ");
        printList(head);
    }
}