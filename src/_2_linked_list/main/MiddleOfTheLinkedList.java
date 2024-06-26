package _2_linked_list.main;

import _2_linked_list.ListNode;

/**
 * EASY
 * https://leetcode.com/problems/middle-of-the-linked-list/description/
 *
 * Заводим 2 указателя: медленный и быстрый (который бежит в 2 раза быстрее)
 * И когда быстрый достигнет конца, медленный будет ровно на половине.
 * */
public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.getLinkedList(1, 2, 3, 4);
        System.out.println(middleNode(head).val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
