package practice;

public class MergeTwoLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private static ListNode res = null;
    private static ListNode temp = null;

    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                createList(l2.val);
                l2 = l2.next;
            } else {
                createList(l1.val);
                l1 = l1.next;
            }
        }
        while (l1 != null) {
            createList(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            createList(l2.val);
            l2 = l2.next;
        }
        return res;
    }

    public static void createList(int value) {
        if (res == null) {
            res = new ListNode(value);
            temp = res;
            return;
        }
        temp.next = new ListNode(value);
        temp = temp.next;
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        mergeTwoLists1(head1, head2);
    }
}
