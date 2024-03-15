/*
 * @Descripttion: 柱形图中最大的矩形
 * @Author: ansuote
 * @Date: 2024-03-15 10:35:57
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-15 10:51:38
 */
package stack;

import java.util.Stack;;

public class Class84 {
    public int largestRectangleArea(int[] heights) {
        int result = 0;
        if (null == heights || heights.length == 0) {
            return result;
        }

        // 创建新数组，把原来数组收尾加0
        int[] newHeights = new int[heights.length + 2];

        newHeights[0] = 0;
        newHeights[newHeights.length - 1] = 0;

        for (int i = 1; i < heights.length + 1; i++) {
            newHeights[i] = heights[i - 1];
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < newHeights.length; i++) {

            // 找到右边中比单调递减栈小的，说明遇到右边界
            while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                // 高度
                int cur = stack.pop();
                int curHeight = newHeights[cur];
                // 宽度
                int width = i - stack.peek() - 1;
                // 取最大值
                result = Math.max(result, curHeight * width);
            }

            stack.push(i);
        }

        return result;
    }
}
