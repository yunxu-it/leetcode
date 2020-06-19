from unittest import TestCase

from source.LC0125_Valid_Palindrome import Solution


class TestSolution(TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_is_palindrome(self):
        self.assertEqual(self.solution.isPalindrome("waaw"), True)
