class Solution:
    # @param tokens, a list of string
    # @return an integer
    def evalRPN(self, tokens):
        stack = []
        for item in tokens:
            if item not in ('+','-','*','/'):
                stack.append(int(item))
            else:
                op2 = stack.pop()
                op1 = stack.pop()
                if item == '+':
                    stack.append(op1+op2)
                elif item == '-':
                    stack.append(op1 - op2)
                elif item == '*':
                    stack.append(op1 * op2)
                elif item == '/':
                    stack.append(int(op1 * 1.0/ op2))
        return stack[0]
