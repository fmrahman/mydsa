package com.mfr.dsa.twopointers;

import com.mfr.dsa.util.ListNode;
public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthLastNode(ListNode head, int n) {
        ListNode startNode = head, endNode = head;
        int i = 1;
        while (i<=n) {
            endNode = endNode.next;
            ++i;
        }

        if (endNode == null) {
            assert head != null;
            return head.next;
        }

        ListNode prevNode = null;
        while (endNode != null) {
            prevNode = startNode;
            startNode = startNode.next;
            endNode = endNode.next;
        }

        if (prevNode.next != null) {
            prevNode.next = prevNode.next.next;
        }

        return head;
    }

}
