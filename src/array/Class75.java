/*
 * @Descripttion: [颜色分类](https://leetcode.cn/problems/sort-colors/)
 * @Author: ansuote
 * @Date: 2024-03-06 15:55:24
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 10:15:11
 */
package array;

public class Class75 {
    public void sortColors(int[] nums) {
        if (null == nums || nums.length == 0) {
            return;
        }

        int left = 0;
        int index = 0;
        int right = nums.length - 1;

        // 里面要判断 <= ，不然可能会导致最后一个元素漏掉排序
        while (index <= right) {
            int indexValue = nums[index];
            if (indexValue == 0) {
                swap(nums, index, left);
                left++;
                index++;
            } else if (indexValue == 1) {
                index++;
            } else if (indexValue == 2) {
                swap(nums, index, right);
                right--;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
