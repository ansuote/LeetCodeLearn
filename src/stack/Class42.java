/*
 * @Descripttion: [接雨水](https://leetcode.cn/problems/trapping-rain-water/)
 * @Author: ansuote
 * @Date: 2024-03-14 18:40:20
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 10:25:37
 */
package stack;

import java.util.Stack;

public class Class42 {
    public int trap(int[] height) {
        int result = 0;

        if (null == height || height.length <= 2) {
            return result;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else if (height[i] <= height[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                    int bottom = stack.pop();
                    if (!stack.isEmpty()) {
                        int h = Math.min(height[i], height[stack.peek()]) - height[bottom];
                        int w = i - stack.peek() - 1;
                        result += h * w;
                    }
                }
                stack.push(i);
            }
        }

        return result;
    }
}
