/*
 * @Descripttion: [寻找重复数](https://leetcode.cn/problems/find-the-duplicate-number/)
 * @Author: ansuote
 * @Date: 2024-03-22 19:05:38
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-22 19:11:24
 */
package pointer;

public class Class287 {
    public int findDuplicate(int[] nums) {
        int result = -1;
        if (null == nums || nums.length == 0) {
            return result;
        }

        int slow = 0;
        int flast = 0;

        slow = nums[slow];

        flast = nums[nums[flast]];

        while (slow != flast) {
            slow = nums[slow];
            flast = nums[nums[flast]];
        }

        int start = 0;
        int end = flast;

        while (start != end) {
            start = nums[start];
            end = nums[end];
        }

        result = end;

        return result;
    }
}
