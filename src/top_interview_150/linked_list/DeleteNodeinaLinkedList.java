package top_interview_150.linked_list;

/**
 * MEDIUM
 *https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
