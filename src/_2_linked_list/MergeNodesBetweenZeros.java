package _2_linked_list;

/**
 * MEDIUM
 * https://leetcode.com/problems/merge-nodes-in-between-zeros/description/
 */
public class MergeNodesBetweenZeros {
    public static void main(String[] args) {
        ListNode head = ListNode.getLinkedList(0, 3, 1, 0, 4, 5, 2, 0);
        ListNode listNode = mergeNodes(head);
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode newHead = head;
        ListNode curr = head;
        int sum = 0;
        while(curr != null) {
            if(curr.val != 0) {
                sum = sum + curr.val;
            } else {
                if (sum > 0) {
                    newHead.next = new ListNode(sum);
                    newHead = newHead.next;
                    sum = 0;
                }
            }
            curr = curr.next;
        }
        return head.next;
    }


}
