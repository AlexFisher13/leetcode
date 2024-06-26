package _2_linked_list;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getLinkedList(int ...vals) {
        ListNode head = new ListNode(vals[0]);
        ListNode prev = head;
        for (int i = 1; i < vals.length; i++) {
            ListNode newNode = new ListNode(vals[i]);
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }
}
