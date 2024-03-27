/*
 * @Descripttion: [删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/)
 * @Author: ansuote
 * @Date: 2024-03-06 15:55:24
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-06 15:57:41
 */
package array;

public class Class26 {
    public int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0) {
            return -1;
        }

        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                nums[resultIndex] = nums[i];
                resultIndex++;
            }

        }

        return resultIndex;
    }
}
