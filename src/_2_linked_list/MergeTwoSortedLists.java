package _2_linked_list;

/**
 * EASY
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * тут мы проходим по двум спискам и сравниваем их элементы и записываем в результурующий
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = ListNode.getLinkedList(1, 2, 4);
        ListNode lsit2 = ListNode.getLinkedList(1, 3, 4);
        ListNode merged = mergeTwoLists(list1, lsit2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode curr = result;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // Но т.к. списки могут быть разной длины, мы потом каждый дописываем в конец.
        while(list1 != null) {
            curr.next = list1;
            curr = curr.next;
            list1 = list1.next;
        }

        while(list2 != null) {
            curr.next = list2;
            curr = curr.next;
            list2 = list2.next;
        }

        return result.next;
    }
}
