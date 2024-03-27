/*
 * @Descripttion: [有效括号](https://leetcode.cn/problems/valid-parentheses/)
 * @Author: ansuote
 * @Date: 2024-03-14 15:35:46
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 10:25:18
 */
package stack;

import java.util.Stack;

public class Class20 {
    public boolean isValid(String s) {
        if (null == s || s.isEmpty()) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();

        for (Character item : s.toCharArray()) {
            if (item == '(' || item == '{' || item == '[') {
                stack.push(item);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                Character top = stack.pop();

                if (top == '(' && item == ')' || top == '{' && item == '}' || top == '[' && item == ']') {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
