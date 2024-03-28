/*
 * @Descripttion: [最接近的三数之和](https://leetcode.cn/problems/3sum-closest/description/)
 * @Author: ansuote
 * @Date: 2024-03-28 15:06:09
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-28 15:15:49
 */
package greedy;

import java.util.Arrays;

public class Class16 {
    public int threeSumClosest(int[] nums, int target) {
        // 因为题目，假定每组输入只存在恰好一个解。所以不用担心越界问题
        // 先获取一个存在的和。此处不能假定为0，因为0不一定存在
        int res = nums[0] + nums[1] + nums[2];

        // 让数组从小到大排序
        Arrays.sort(nums);

        // 定义 i、left、right 三个数
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int current = nums[i] + nums[left] + nums[right];
                // 判断当前数是否比之前存储的数更加接近，是则重置
                if (Math.abs(current - target) < Math.abs(res - target)) {
                    res = current;
                }

                if (current > target) {
                    right--;
                } else if (current < target) {
                    left++;
                } else {
                    return res;
                }
            }

        }

        return res;
    }
}
