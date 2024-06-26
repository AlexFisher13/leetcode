package _2_linked_list;

/**
 * MEDIUM
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = ListNode.getLinkedList(2,4,9);
        ListNode l2 = ListNode.getLinkedList(5,6,4,9);
        ListNode result = addTwoNumbers(l1, l2);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i1 = 0;
        int i2 = 0;

        while (l1 != null) {
            if (l1.next != null) {
                i1 = (i1 + l1.val) * 10;
            } else {
                i1 = i1 + l1.val;
            }
            l1 = l1.next;
        }

        while (l2 != null) {
            if (l2.next != null) {
                i2 = (i2 + l2.val) * 10;
            } else {
                i2 = i2 + l2.val;
            }
            l2 = l2.next;
        }

        return null;
    }
}
