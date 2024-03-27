/*
 * @Descripttion: [x的平方根](https://leetcode.cn/problems/sqrtx/description/)
 * @Author: ansuote
 * @Date: 2024-03-22 19:53:30
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 10:23:58
 */
package pointer;

public class Class69 {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;

        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // 等于x的时候也要保存值
            if ((long) mid * mid <= x) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
