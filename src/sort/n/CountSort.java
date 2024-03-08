/*
 * @Descripttion: 计数排序
 * @Author: ansuote
 * @Date: 2024-03-08 18:59:21
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 19:48:21
 */
package sort.n;

import sort.ISort;

public class CountSort implements ISort {

    @Override
    public int[] sort(int[] originNum) {
        if (null == originNum || originNum.length == 0) {
            return originNum;
        }

        int n = originNum.length;

        // 确定最大值与最小值之差。
        int max = originNum[0];
        int min = originNum[0];
        for (int i = 1; i < originNum.length; i++) {
            int current = originNum[i];
            if (current > max) {
                max = current;
            }

            if (current < min) {
                min = current;
            }
        }
        int arrCount = max - min;

        // 建立数量数组
        int[] countArray = new int[arrCount + 1];
        for (int i = 0; i < n; i++) {
            countArray[originNum[i] - min]++;
        }

        // 累计数量数组
        // System.out.println(Arrays.toString(countArray));

        for (int i = 1; i < arrCount + 1; i++) {
            countArray[i] += countArray[i - 1];
        }
        // System.out.println(Arrays.toString(countArray));

        int[] resultNum = new int[n];
        // 排序输出
        for (int i = originNum.length - 1; i >= 0; i--) {
            // countArray存的是数量，对应的索引要-1
            resultNum[countArray[originNum[i] - min] - 1] = originNum[i];
            countArray[originNum[i] - min]--;
        }

        return resultNum;
    }

}