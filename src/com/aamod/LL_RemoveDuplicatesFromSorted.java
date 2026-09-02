package com.aamod;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LL_RemoveDuplicatesFromSorted {

    public static void main(String[] args) {

    }

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode i = head;
        ListNode j = head.next;

        while (j != null) {

            if (i.val == j.val) {
                i.next = j.next;
            } else {
                i = i.next;
            }

            j = j.next;
        }

        return head;
    }
}