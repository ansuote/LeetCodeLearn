/*
 * @Descripttion: [分发饼干](https://leetcode.cn/problems/assign-cookies/description/)
 * @Author: ansuote
 * @Date: 2024-03-28 13:39:00
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-28 13:47:13
 */

package greedy;

import java.util.Arrays;

public class Class455 {
    /**
     * 
     * @param g 胃口值 g = [1,2,3],
     * @param s 饼干大小 s = [1,1]
     * @return 多少个孩子满足 1
     */
    public int findContentChildren(int[] g, int[] s) {
        int childCount = 0;

        if (null == g || g.length == 0 || null == s || s.length == 0) {
            return childCount;
        }

        // 从小到大排序
        Arrays.sort(g);
        Arrays.sort(s);

        // 饼干索引
        int cookie = 0;

        while (childCount < g.length && cookie < s.length) {
            if (g[childCount] <= s[cookie]) {
                childCount++;
            }

            cookie++;
        }

        return childCount;
    }
}
