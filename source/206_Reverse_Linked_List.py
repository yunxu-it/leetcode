# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    def reverseList(self, head):
        last, cur = None, head
        while cur:
            next = cur.__next__
            cur.next = last
            last = cur
            cur = next
        return last
#
#     def show(self, node):
#         print node.val
#         if node.next:
#             self.show(node.next)
#         return
#
# l1 = ListNode(1)
# l2 = ListNode(2)
# l3 = ListNode(3)
# l4 = ListNode(4)
# l1.next = l2
# l2.next = l3
# l3.next = l4
# l4.next = None
#
# S = Solution()
#
# S.show(S.reverseList(l1))
