package _2_linked_list.main;

import _2_linked_list.ListNode;

/**
 * EASY
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 * <p>
 * У нас будет 2 указателя fake и curr
 * fake - фиктивный указатель, который нужен для того чтобы хранить ссылку на первый элемент,
 * т.к. head может попасть под удаление. fake не будет перемещаться.
 * curr - будет хранить текущий указатель. Который будет сначала указывать на fake
 */
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode head = ListNode.getLinkedList(1, 2, 3, 4);
        ListNode listNode = removeElements(head, 4);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode fake = new ListNode(0);
        ListNode curr = fake;
        fake.next = head;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return fake.next;
    }
}
