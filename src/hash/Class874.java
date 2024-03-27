/*
 * @Descripttion: [模拟行走机器人](https://leetcode.cn/problems/walking-robot-simulation/)
 * @Author: ansuote
 * @Date: 2024-03-21 18:44:48
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 10:21:22
 */
package hash;

import java.util.HashSet;;

public class Class874 {
    /**
     * 
     * @param commands  行走数组
     * @param obstacles 障碍物数组
     * @return
     */
    public int robotSim(int[] commands, int[][] obstacles) {
        int result = 0;

        // 北0
        // 东1
        // 南2
        // 西3
        // 方向数组
        int[][] directs = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        HashSet<String> set = new HashSet<>();

        // 遍历障碍物存储到set里面
        for (int[] item : obstacles) {

            String value = getBufferString(item[0], item[1]);
            if (!set.contains(value)) {
                set.add(value);
            }
        }

        int derection = 0;
        int x = 0;
        int y = 0;

        for (int comm : commands) {

            if (comm == -2) {
                // 向左转 90 度
                derection = derection == 0 ? 3 : derection - 1;

            } else if (comm == -1) {
                // 向右转 90 度
                derection = derection == 3 ? 0 : derection + 1;
            } else {
                while (comm-- > 0 && !set.contains(getBufferString(x + directs[derection][0], y + directs[derection][1]))) {
                    x = directs[derection][0] + x;
                    y = directs[derection][1] + y;
                }
            }

            result = Math.max(result, x * x + y * y);
        }

        return result;
    }

    private String getBufferString(int x, int y) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(x);
        buffer.append(",");
        buffer.append(y);
        return buffer.toString();
    }
}
