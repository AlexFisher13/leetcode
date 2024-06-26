package _2_linked_list;

/**
 * EASY
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
 */
public class ConvertBinaryNumberinLinkedListtoInteger {
    public static void main(String[] args) {
        ListNode head = ListNode.getLinkedList(1,0,0,1,0,0,1,1,1,0,0,0,0,0,0);
        System.out.println(getDecimalValue(head));
    }

    public static int getDecimalValue(ListNode head) {
        head = reverse(head);

        int result = 0;
        int degree = 0;
        while(head != null) {
            result = result + head.val * (int) Math.pow(2, degree);
            System.out.println(head.val + " 2*" + "degree = " + head.val * (int) Math.pow(2, degree));
            degree++;
            head = head.next;
        }

        return result;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
