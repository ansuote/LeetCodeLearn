/*
 * @Descripttion: 最大矩形
 * @Author: ansuote
 * @Date: 2024-03-15 11:09:28
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-15 13:38:05
 */

package stack;

public class Class85 {
    public int maximalRectangle(char[][] matrix) {
        int res = 0;

        if (null == matrix || matrix.length == 0 || null == matrix[0] || matrix[0].length == 0) {
            return res;
        }

        int[] heights = new int[matrix[0].length];

        Class84 class84 = new Class84();

        // 每一行重新计算新的 heights
        for (int i = 0; i < matrix.length; i++) {
            // 每一列如果有1，就累加1
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            res = Math.max(res, class84.largestRectangleArea(heights));

        }

        return res;
    }
}
