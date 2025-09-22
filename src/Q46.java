public class Q46 {
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next; // store next node
            curr.next = prev;      // reverse current node's pointer
            prev = curr;           // move prev forward
            curr = next;           // move curr forward
        }
        return prev; // new head
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original Linked List:");
        printList(head);

        // Reversing the linked list
        head = reverse(head);

        System.out.println("Reversed Linked List:");
        printList(head); // Output: 40 -> 30 -> 20 -> 10
    }
}
