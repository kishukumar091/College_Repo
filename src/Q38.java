public class Q38 {
    static Node inserAtEnd(Node head, int x) {

        // Create a new node
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;

        // Return the head of the list
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = inserAtEnd(head, 6);

        printList(head);
    }
}
