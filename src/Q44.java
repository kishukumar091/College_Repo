import java.util.*;

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Q44 {

    // Function to add two numbers represented by linked lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify result list
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If carry is remaining
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }

    // Helper function to print a linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 342 + 465 = 807
        ListNode l1 = new ListNode(2); // represents 2 -> 4 -> 3 (342)
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5); // represents 5 -> 6 -> 4 (465)
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        System.out.print("Sum: ");
        printList(result); // Output: 7 -> 0 -> 8 (807)
    }
}

