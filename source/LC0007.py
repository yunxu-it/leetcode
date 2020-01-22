# https://leetcode-cn.com/problems/reverse-integer/solution/zheng-shu-fan-zhuan-by-leetcode/


class Solution:
    def reverse(self, x: int) -> int:
        rev = 0
        temp_x = abs(x)
        while temp_x != 0:
            pop = temp_x % 10
            temp_x //= 10
            if rev > (2 ** 31 - 1) // 10 or (rev ==
                                             (2 ** 31 - 1) // 10 and pop > 7):
                return 0
            if rev < -(2 ** 31) // 10 or (rev == -
                                          (2 ** 31) // 10 and pop < -8):
                return 0
            rev = rev * 10 + pop

        if x > 0:
            return rev
        if x < 0:
            return -rev
        return rev
