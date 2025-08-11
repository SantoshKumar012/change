class LLpalindrom{
   public ListNode reverseLinkedList(ListNode head){
    if(head==null || head.next == null){
      return head;
    }
      ListNode newHead = reverseLinkedList(head.next);

     ListNode front= head.next;
      front.next = head;
      head.next=null;
      return newHead;

    }
    public boolean isPalindrome(ListNode head){
if (head == null || head.next == null) {
            // It's a palindrome by definition
            return true;

        }
        ListNode slow= head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode newHead = reverseLinkedList(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        while (second != null){
            if(first.val != second.val){
                reverseLinkedList(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLinkedList(newHead);
        return true;

        
    }
   }
   class Main{
    static void printLinkedList(ListNode head){
        ListNode temp =head;
        while(temp != null ){
            System.out.println(temp.val +"");
            temp = temp.next;

        }
        System.out.println();
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(2);
        head.next.next.next= new ListNode(5);
        head.next.next.next.next = new ListNode(1);
        System.out.println("original LinkedList:");
        printLinkedList(head);
         solution =new Solution();
        if(solution.isPalindrome(head)){
            System.out.println("the linkedlist is palindrome");
    }else{
        System.out.println("the linkedlist is not a palindrom");
    }

    }
   }