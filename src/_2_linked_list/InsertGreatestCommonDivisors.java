package _2_linked_list;

/**
 * MEDUIM
 * https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
 *
 */
public class InsertGreatestCommonDivisors {
    public static void main(String[] args) {
        ListNode head = ListNode.getLinkedList(18, 6, 10, 3);
        ListNode listNode = insertGreatestCommonDivisors(head);
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null) {
            return null;
        }
        var prev = head;
        var curr = head.next;

        while (curr != null) {
            var middle = getDivider(prev.val, curr.val);
            prev.next = middle;
            middle.next = curr;
            curr = curr.next;
            prev = middle.next;
        }
        return head;
    }

    public static ListNode getDivider(int a, int b) {
        int x = Math.min(a, b);
        for(int i = x; i>1; i--) {
            if(a%i==0 && b%i==0){
                return new ListNode(i);
            }
        }
        return new ListNode(1);
    }
}
