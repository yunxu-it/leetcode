class Stack:
    # initialize your data structure here.
    def __init__(self):
        self.que = []

    # @param x, an integer
    # @return nothing
    def push(self, x):
        self.que.append(x)

    # @return nothing
    def pop(self):
        if self.que:
            self.que.pop()

    # @return an integer
    def top(self):
        return self.que[-1]

    # @return an boolean
    def empty(self):
        return True if not self.que else False