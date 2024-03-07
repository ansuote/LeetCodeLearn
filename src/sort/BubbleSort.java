/*
 * @Descripttion: 冒泡排序
 * @Author: ansuote
 * @Date: 2024-03-07 19:08:46
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-07 19:30:14
 */
package sort;

import utils.StringUtils;

public class BubbleSort {
    public void bubbleSort(int[] nums) {
        if (null == nums || nums.length == 0) {
            return;
        }

        int n = nums.length;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void test(int[] nums) {
        System.out.println("执行冒泡排序前");
        StringUtils.println(nums);

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(nums);

        System.out.println("执行冒泡排序后");
        StringUtils.println(nums);

    }
}
