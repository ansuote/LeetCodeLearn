/*
 * @Descripttion: [搜索插入位置](https://leetcode.cn/problems/search-insert-position/description/)
 * @Author: ansuote
 * @Date: 2024-03-27 14:02:02
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 14:09:58
 */
package binarySearch;

public class Class35 {
    public int searchInsert(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
