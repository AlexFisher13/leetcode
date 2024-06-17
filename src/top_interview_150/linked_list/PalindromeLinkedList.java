package top_interview_150.linked_list;

/**
 * EASY
 * https://leetcode.com/problems/palindrome-linked-list/description/
 *
 * Эта задача включает в себя задачи
 * 1) на нахождение середины списка - {@link MiddleOfTheLinkedList}
 * 2) на реверс списка - {@link ReverseLinkedList}
 *
 * Нам здесь нужно дойти до середины. Начиная с середины сделать реверс.
 * Таким образом у нас получится 2 подсписка: начиная с head, и реверс начиная с середины.
 * Теперь нам нужно их просто сравнить между собой
 * */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.getLinkedList(1, 2, 3, 2, 1);
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode middle = getMiddle(head);
        ListNode reverse = reverse(middle);

        while(reverse != null) {
            if (reverse.val != head.val) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }
        return true;
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

    public static ListNode getMiddle(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
