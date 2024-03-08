/*
 * @Descripttion: 冒泡排序
 * @Author: ansuote
 * @Date: 2024-03-07 19:08:46
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 14:52:25
 */
package sort.n2;

import java.util.Arrays;

import sort.ISort;

public class BubbleSort implements ISort {

    @Override
    public int[] sort(int[] originNum) {
        if (null == originNum || originNum.length == 0) {
            return originNum;
        }

        int n = originNum.length;

        int[] nums = Arrays.copyOf(originNum, n);

        for (int i = 0; i <= n - 1; i++) {
            boolean flag = true;

            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }

        return nums;
    }
}
