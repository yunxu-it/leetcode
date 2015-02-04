/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode ln1, ln2;
        if (head == null)
            return false;
        ln1 = head;
        ln2 = head;
        while (ln1 != null && ln2 != null) {
            ln1 = ln1.next;
            if (ln2.next == null)
                return false;
            ln2 = ln2.next.next;
            if (ln1 == ln2)
                return true;
        }
        return false;
    }
}
