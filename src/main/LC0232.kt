package main

import java.util.Stack

/**
 * Date: 10/10/2017
 * Origin: https://leetcode.com/problems/implement-queue-using-stacks/description/
 */
internal class MyQueue {

    private val queue: Stack<Int> = Stack()

    /**
     * Push element x to the back of queue.
     */
    fun push(x: Int) {
        val temp = Stack<Int>()
        while (!queue.empty()) {
            temp.push(queue.pop())
        }
        queue.push(x)
        while (!temp.empty()) {
            queue.push(temp.pop())
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    fun pop(): Int {
        return queue.pop()
    }

    /**
     * Get the front element.
     */
    fun peek(): Int {
        return queue.peek()
    }

    /**
     * Returns whether the queue is empty.
     */
    fun empty(): Boolean {
        return queue.empty()
    }
}


/**
 * Your main.MyQueue object will be instantiated and called as such:
 * main.MyQueue obj = new main.MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

//  better solution
// class main.MyQueue {
//
//    private final Stack<Integer> queue;
//
//    /**
//     * Initialize your data structure here.
//     */
//    public main.MyQueue() {
//        queue = new Stack<>();
//    }
//
//    /**
//     * Push element x to the back of queue.
//     */
//    public void push(int x) {
//        Stack<Integer> temp = new Stack<>();
//        while (!queue.empty()) {
//            temp.push(queue.pop());
//        }
//        queue.push(x);
//        while (!temp.empty()) {
//            queue.push(temp.pop());
//        }
//    }
//
//    /**
//     * Removes the element from in front of queue and returns that element.
//     */
//    public int pop() {
//        return queue.pop();
//    }
//
//    /**
//     * Get the front element.
//     */
//    public int peek() {
//        return queue.peek();
//    }
//
//    /**
//     * Returns whether the queue is empty.
//     */
//    public boolean empty() {
//        return queue.empty();
//    }
//}