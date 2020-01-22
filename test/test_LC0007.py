# -*- coding: utf-8 -*-
from unittest import TestCase

from source.LC0007 import Solution


class TestSolution(TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_reverse(self):
        self.assertEqual(self.solution.reverse(123), 321)
        self.assertEqual(self.solution.reverse(-123), -321)
        self.assertEqual(self.solution.reverse(2 ** 31 - 1), 0)
        self.assertEqual(self.solution.reverse(-2 ** 31), 0)
