/*
 * @Descripttion: 逆波兰表达式求值
 * @Author: ansuote
 * @Date: 2024-03-14 18:40:20
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-14 20:50:32
 */
package stack;

import java.util.Stack;

public class Class150 {

    public int evalRPN(String[] tokens) {
        int result = 0;
        if (null == tokens || tokens.length == 0) {
            return result;
        }

        int left = 0;
        int right = 0;
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if ("+".equals(token)) {
                right = stack.pop();
                left = stack.pop();
                result = left + right;
            } else if ("-".equals(token)) {
                right = stack.pop();
                left = stack.pop();
                result = left - right;
            } else if ("*".equals(token)) {
                right = stack.pop();
                left = stack.pop();
                result = left * right;
            } else if ("/".equals(token)) {
                right = stack.pop();
                left = stack.pop();
                result = left / right;
            } else {
                result = Integer.parseInt(token);
            }
            stack.push(result);
        }

        return stack.pop();
    }
}
