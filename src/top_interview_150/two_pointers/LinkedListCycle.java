package top_interview_150.two_pointers;

/**
 * EASY
 * https://leetcode.com/problems/linked-list-cycle/description/
 * Используем алгоритм зайца и черепахи, т.е. два указателя которые будут двигаться с разной скоростью
 * Первый будет двигаться на 1 элемент, а второй на 2.
 * Если цикл есть, то быстрый указать быстро зациклится, и однажды встретится на одном элементе с медленным указателем
 * Если цикла нет - то быстрый указатель пройдет до конца не встретив первый
 */
public class LinkedListCycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
