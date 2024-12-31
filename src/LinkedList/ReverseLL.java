package LinkedList;


// How to think
// start with 1 node then with 2 Nodes

public class ReverseLL {

    static class Node{
        private int value;
        Node next;
        public Node(int val){
            this.value=val;
            this.next=null;
        }

    }

    public static Node reverseLL(Node head ){

        Node prev=null;
        Node curr=head;

        while(curr!=null){

            Node next=curr.next;  // store the next node
            curr.next=prev; // ( set next node as null )
            prev=curr;
            curr=next;
        }

        return prev ;// as the new head of the rev L.L

    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Creating a linked list 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        printList(head);

        // Reversing the list iteratively
        Node reversedHead = reverseLL(head);
        System.out.println("Reversed list (iterative):");
        printList(reversedHead);


    }
}
