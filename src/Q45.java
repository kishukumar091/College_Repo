public class Q45 {
    // Reverse a linked list
    static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Add two numbers represented by linked lists
    static Node addTwoLists(Node l1, Node l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            curr.next = new Node(sum % 10);
            carry = sum / 10;
            curr = curr.next;
        }

        return reverse(dummy.next); // Reverse to get forward order
    }

    // Print linked list
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First number: 1 -> 2 -> 3 (represents 123)
        Node num1 = new Node(1);
        num1.next = new Node(2);
        num1.next.next = new Node(3);

        // Second number: 9 -> 9 -> 9 (represents 999)
        Node num2 = new Node(9);
        num2.next = new Node(9);
        num2.next.next = new Node(9);

        Node sum = addTwoLists(num1, num2); // Should represent 1122
        System.out.print("Sum: ");
        printList(sum); // Output: 1 -> 1 -> 2 -> 2
    }
}
