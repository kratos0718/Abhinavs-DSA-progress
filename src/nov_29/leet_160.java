package nov_29;

public class leet_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA, b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;

        leet_160 sol = new leet_160();
        ListNode intersection = sol.getIntersectionNode(headA, headB);
        System.out.println(intersection != null ? intersection.val : "null"); // 8
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}