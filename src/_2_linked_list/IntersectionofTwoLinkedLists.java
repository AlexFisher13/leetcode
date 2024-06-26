package _2_linked_list;

/**
 * EASY
 * https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 * Мы должны замерить длину обоих списоков. Найти разницу в длинах.
 * И с учетом разница определить стартовые позиции и начать поэлементно сравнивать элементы списка каждого списка.
 * Если нашли пересечение, то
 */
public class IntersectionofTwoLinkedLists {
    public static void main(String[] args) {
        //listA = [4,1,8,4,5], listB = [5,6,1,8,4,5] Intersection on 8
//        ListNode a5 = new ListNode(5, null);
//        ListNode a4 = new ListNode(4, a5);
//        ListNode a3 = new ListNode(8, a4);
//        ListNode a2 = new ListNode(1, a3);
//        ListNode a1 = new ListNode(4, a2);
//
//        ListNode b3 = new ListNode(1, a3);
//        ListNode b2 = new ListNode(6, b3);
//        ListNode b1 = new ListNode(5, b2);

        ListNode a1 = new ListNode(3, null);
        ListNode b1 = new ListNode(2, a1);

        ListNode intersectionNode = getIntersectionNode(a1, b1);
    }


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) {
            return headA;
        }

        int lenA = 0;
        int lenB = 0;
        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != null) {
            lenA++;
            pA = pA.next;
        }
        while (pB != null) {
            lenB++;
            pB = pB.next;
        }

        int diff = 0;

        ListNode startA = headA;
        ListNode startB = headB;
        if (lenA > lenB) {
            diff = lenA - lenB;
            while (diff != 0) {
                startA = startA.next;
                diff--;
            }
        } else {
            diff = lenB - lenA;
            while (diff != 0) {
                startB = startB.next;
                diff--;
            }
        }

        ListNode result = null;
        while (startA != null) {
            if(startA == startB) {
                result = startA;
                break;
            }
            startA = startA.next;
            startB = startB.next;
        }
        return result;
    }
}
