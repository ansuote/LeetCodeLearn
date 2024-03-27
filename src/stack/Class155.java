/*
 * @Descripttion: [最小栈](https://leetcode.cn/problems/min-stack/)
 * @Author: ansuote
 * @Date: 2024-03-14 17:04:39
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 10:26:58
 */
package stack;

import java.util.Stack;

public class Class155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public Class155() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop() {
        int val = stack.pop();

        if (minStack.peek() == val) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
