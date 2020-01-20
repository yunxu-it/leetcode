class Solution:
    def reverse(self, x: int) -> int:
        rev = 0
        temp_x = x
        while temp_x != 0:
            pop = temp_x % 10
            temp_x //= 10
            if rev > (2 ** 31 - 1) // 10 or (rev == (2 ** 31 - 1) // 10 and pop > 7):
                return 0
            if rev < -(2 ** 31) // 10 or (rev == -(2 ** 31) // 10 and pop < -8):
                return 0
            rev = rev * 10 + pop
        return rev


solution = Solution()
print(solution.reverse(123))
print(solution.reverse(-123))
print(2**31-1)
print(-2**31)