/*
 * @Descripttion: 冒泡排序
 * @Author: ansuote
 * @Date: 2024-03-07 19:08:46
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 09:22:28
 */
package sort;

import utils.StringUtils;
import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] originNum) {
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

    public static void test(int[] nums) {
        System.out.println("执行冒泡排序前");
        StringUtils.println(nums);

        BubbleSort sort = new BubbleSort();
        int[] resultNums = sort.bubbleSort(nums);

        System.out.println("执行冒泡排序后");
        StringUtils.println(resultNums);

    }
}
