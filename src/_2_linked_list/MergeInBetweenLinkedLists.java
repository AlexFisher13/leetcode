package _2_linked_list;

/**
 * MEDIUM
 * https://leetcode.com/problems/merge-in-between-linked-lists/description/
 */
public class MergeInBetweenLinkedLists {
    public static void main(String[] args) {
        ListNode list1 = ListNode.getLinkedList(10, 1, 13, 6, 9, 5);
        ListNode list2 = ListNode.getLinkedList(1000000, 1000001, 1000002);

        mergeInBetween(list1, 3, 4, list2);
    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        ListNode preANote = null;
        ListNode postbNote = null;
        int count = 0;
        while (curr != null) {
            if (count == a - 1) {
                preANote = curr;
            }
            if (count == b) {
                postbNote = curr.next;
            }
            curr = curr.next;
            count++;
        }
        if (preANote == null || postbNote == null) {
            return list1;
        }
        preANote.next = list2;

        curr = list2;
        if (list2 == null) {
            return list1;
        }
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = postbNote;

        return list1;
    }

}
