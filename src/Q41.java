public class Q41 {
    static boolean isCircular(Node head) {
        if (head == null)
            return true;

        Node slow = head, fast = head.next;

        // Traverse the linked list with two pointers
        while (fast != null && fast.next != null) {
            if (slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Check if the linked list is circular
        System.out.println(isCircular(head) ? "Yes" : "No");

        // Making the linked list circular
        head.next.next.next.next = head;

        // Check again if the linked list is circular
        System.out.println(isCircular(head) ? "Yes" : "No");
    }
}
