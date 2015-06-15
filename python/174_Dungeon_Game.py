#!/usr/bin/env python
# encoding: utf-8

class Solution:
    # @param dungeon, a list of lists of integers
    # @return a integer
    def calculateMinimumHP(self, dungeon):
        m,n = len(dungeon),len(dungeon[0])
        hp = [[0 for x in range(n)]for x in range(m)]
        hp[m-1][n-1] = 1
        for i in range(m-1,-1,-1):
            for j in range(n-1,-1,-1):
                if i == m-1 and j == n-1:
                    continue
                elif i == m-1:
                    hp[i][j] = max(1, hp[i][j+1] - dungeon[i][j+1])
                elif j == n - 1:
                    hp[i][j] = max(1, hp[i+1][j] - dungeon[i+1][j])
                else:
                    hp[i][j] = min(max(1,hp[i+1][j] - dungeon[i+1][j]),
                            max(1,hp[i][j+1] - dungeon[i][j+1]))
        return max(1,hp[0][0] - dungeon[0][0])
