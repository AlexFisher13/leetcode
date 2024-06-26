package _2_linked_list.main;

import _2_linked_list.ListNode;

/**
 * EASY
 * https://leetcode.com/problems/reverse-linked-list/description/
 *
 * Для разворота связанного списка нам нужны два указателя,
 * которые будут хранить предыдущий и следующий элемент
 * Мы будем перемещать эти указатели и перебрасывать ссылки
 * */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = ListNode.getLinkedList(1, 2, 3);
        System.out.println(reverse(head).val);
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nxt = curr.next; //сохраняем ссылку на след. элемент чтобы не потерять
            curr.next = prev; // перекидываем ссылку на предыдущий
            // далее просто передвигаем указатели
            prev = curr;
            curr = nxt;
        }
        return prev; // prev т.к. мы выходим из цилка по условию где curr == null, и нолучается prev наш последний элемент
    }
}