package top_interview_150.two_pointers;

/**
 * MEDIUM
 * https://leetcode.com/problems/linked-list-cycle-ii/description/
 * Тут тоже самое, что и в первой части, но еще нужно найти на каком элементе происходит зацикливание,
 * то есть на какой элемент ссылается хвост.
 * Это сделать очень просто, в момент того когда быстрый указатель зациклился и встретился с медленным,
 * нам нужно сбросить медленный указатель на начало, а быстрый начать перемещать с такой же скоростью, что и медленный.
 * и где они встретятся - наш искомый элемент.
 */
public class LinkedListCycle2 {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        ListNode interaction = getInteraction(head);
        if (interaction != null) {
            ListNode slow = head;
            ListNode fast = interaction;

            while (slow != null) {
                if (fast == slow) {
                    return fast;
                } else {
                    fast = fast.next;
                    slow = slow.next;
                }
            }
        }
        return null;
    }

    public ListNode getInteraction(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return fast;
            }
        }
        return null;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
