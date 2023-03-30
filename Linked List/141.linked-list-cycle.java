/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start

 // Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast_pointer = head.next;
        ListNode second_pointer = head;

        while (fast_pointer == second_pointer || fast_pointer.next != null) {
            fast_pointer = fast_pointer.next;
            if (fast_pointer == second_pointer || fast_pointer.next == null) {
                break;
            }
            fast_pointer = fast_pointer.next;
            second_pointer = second_pointer.next;
        }

        return (fast_pointer == second_pointer);
    }
}
// @lc code=end

