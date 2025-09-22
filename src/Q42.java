public class Q42 {
    static Node deleteNode(Node head, int key) {
        if (head == null) return null; // empty list

        // If head needs to be deleted
        if (head.data == key) {
            return head.next;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        // Node with key found, skip it
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    // Function to traverse and print the linked list
    static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original Linked List:");
        traverse(head);

        // Delete node with value 20
        head = deleteNode(head, 20);
        System.out.println("After deleting 20:");
        traverse(head);

        // Delete head node (10)
        head = deleteNode(head, 10);
        System.out.println("After deleting head (10):");
        traverse(head);

        // Delete node not present (50)
        head = deleteNode(head, 50);
        System.out.println("After trying to delete 50 (not present):");
        traverse(head);
    }
}
