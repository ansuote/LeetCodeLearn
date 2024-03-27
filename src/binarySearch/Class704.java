/*
 * @Descripttion: [二分查找](https://leetcode.cn/problems/binary-search/description/)
 * @Author: ansuote
 * @Date: 2024-03-27 13:00:52
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 13:04:47
 */
package binarySearch;

public class Class704 {
    public int search(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;
    }
}
