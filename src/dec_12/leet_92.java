package dec_12;

public class leet_92 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    private static ListNode successor = null;

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode res = reverseBetween(head, 2, 4);
        printList(res); // Expected: 1 -> 4 -> 3 -> 2 -> 5
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1) return reverseN(head, right);
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }

    private static ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}