public class Q39 {
    static Node insertPos(Node head, int pos, int val) {

        if (pos < 1)
            return head;

        // head will change if pos=1
        if (pos == 1) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null)
            return head;

        Node newNode = new Node(val);

        // update the next pointers
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Creating the list 1->2->4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);

        int val = 3, pos = 3;
        head = insertPos(head, pos, val);
        printList(head);
    }
}
