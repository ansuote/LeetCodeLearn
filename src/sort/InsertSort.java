package sort;

import java.util.Arrays;

/*
 * @Descripttion: 插入排序
 * @Author: ansuote
 * @Date: 2024-03-08 10:41:18
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 11:22:12
 */

public class InsertSort implements ISort {
    @Override
    public int[] sort(int[] originNum) {
        if (null == originNum || originNum.length == 0) {
            return originNum;
        }

        int n = originNum.length;
        int[] resultNum = Arrays.copyOf(originNum, n);

        for (int i = 1; i <= n - 1; i++) {

            int keyValue = resultNum[i];

            int j = i - 1;

            while (j >= 0 && resultNum[j] > keyValue) {
                resultNum[j + 1] = resultNum[j];
                j--;
            }

            resultNum[j + 1] = keyValue;
        }

        return resultNum;
    }

}