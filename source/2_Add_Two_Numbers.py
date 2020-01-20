# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


# By StefanPochmann
# https://leetcode.com/discuss/36908/python-for-the-win

class Solution:
    # @param {ListNode} l1
    # @param {ListNode} l2
    # @return {ListNode}

    def addTwoNumbers(self, l1, l2):
        def toint(node):
            return node.val + 10 * toint(node.__next__) if node else 0

        def tolist(n):
            node = ListNode(n % 10)
            if n > 9:
                node.next = tolist(n / 10)
            return node
        return tolist(toint(l1) + toint(l2))

# l1 = ListNode(2)
# l2 = ListNode(4)
# l3 = ListNode(3)
# l1.next = l2
# l2.next = l3
# l3.next = None
#
# l4 = ListNode(5)
# l5 = ListNode(6)
# l6 = ListNode(4)
# l4.next = l5
# l5.next = l6
# l6.next = None
#
#
# s = Solution()
# print s.addTwoNumbers(l1,l4).val
