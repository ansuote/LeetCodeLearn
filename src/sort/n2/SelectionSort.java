/*
 * @Descripttion: 选择排序
 * @Author: ansuote
 * @Date: 2024-03-08 12:46:52
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 12:57:24
 */
package sort.n2;

import java.util.Arrays;

import sort.ISort;

public class SelectionSort implements ISort {

    @Override
    public int[] sort(int[] originNum) {
        if (null == originNum || originNum.length == 0) {
            return originNum;
        }

        int n = originNum.length;
        int[] resultNum = Arrays.copyOf(originNum, n);

        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (resultNum[j] < resultNum[index]) {
                    index = j;
                }
            }

            int temp = resultNum[i];
            resultNum[i] = resultNum[index];
            resultNum[index] = temp;
        }

        return resultNum;
    }

}
