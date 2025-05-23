class ListNode{
  int val;
  ListNode next;

  ListNode(){
    this.val=0;
    this.next=null;
  }
  ListNode(int data1){
    this.val=data1;
    this.next=null;
  }
  ListNode(int data1,ListNode next1 ){
    this.val= data1;
    this.next=next1;
  }
}
class Deletetail{
    public ListNode deleteTail(ListNode head){
if(head== null|| head.next ==null){
    return head;
}
ListNode temp= head;
if(temp.next.next==null){
temp.next=null;
    }
    temp=temp.next;
return head;
}
}
class Main {
    // Helper Function to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    /* Helper Function to insert a new node at
    the beginning of the linked list */
    private static ListNode insertAtHead(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        return newNode;
    }
    
    // Main method
    public static void main(String[] args) {
        // Create a linked list
        ListNode head = null;
        head = insertAtHead(head, 3);
        head = insertAtHead(head, 2);
        head = insertAtHead(head, 1);

        System.out.println("Original list: ");
        printList(head);

        // Creating an instance of Solution class
       Deletetail sol = new Deletetail();

        // Function call to delete the tail node
        head = sol.deleteTail(head);

        System.out.println("List after deleting tail: ");
        printList(head);
    }
}
