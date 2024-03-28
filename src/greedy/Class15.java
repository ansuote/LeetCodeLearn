/*
 * @Descripttion: [三数之和](https://leetcode.cn/problems/3sum/)
 * @Author: ansuote
 * @Date: 2024-03-28 15:06:09
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-28 16:31:20
 */
package greedy;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Class15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (null == nums || nums.length < 3) {
            return list;
        }

        int len = nums.length;

        // 从小到大排序
        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {

            // 如果当前i已经超过0，就没有必要找了
            if (nums[i] > 0) {
                break;
            }

            // 如果i和临近的值相同，则跳过
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = len - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 继续查找
                    left++;
                    right--;

                    // 确保移动后跟之前元素不一样，不然继续移动
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }

            }

        }

        return list;
    }
}
