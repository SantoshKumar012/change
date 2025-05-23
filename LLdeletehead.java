import java.util.*;

class ListNode {
    int val;
    Deletetail next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, Deletetail next1) {
        val = data1;
        next = next1;
    }
}

class LLdeletehead {
    public Deletetail deleteHead(Deletetail head) {
        if (head == null) 
            return null;
            Deletetail temp = head;
            head = head.next;
            temp = null;        
            return head;
    }
}

class Main {
    private static void printList(Deletetail head) {
        Deletetail current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static Deletetail insertAtHead(Deletetail head, int data) {
        Deletetail newNode = new Deletetail(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    
    public static void main(String[] args) {
        Deletetail head = null;
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