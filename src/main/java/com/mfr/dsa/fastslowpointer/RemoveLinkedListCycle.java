package com.mfr.dsa.fastslowpointer;

import com.mfr.dsa.util.ListNode;

public class RemoveLinkedListCycle {

    public static ListNode removeCycle(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prevFast = null;

        while (fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return head;
        }

        slow = head;
        while (fast != slow) {
            prevFast = fast;
            fast = fast.next;
            slow = slow.next;
        }

        while (fast.next != slow) {
            fast = fast.next;
        }

        fast.next = null;
        return head;
    }
}
