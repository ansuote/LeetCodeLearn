/*
 * @Descripttion: 
 * @Author: ansuote
 * @Date: 2024-03-08 14:55:57
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 15:37:03
 */
package sort.nlogn;

import sort.ISort;
import java.util.Arrays;

public class QuickSort implements ISort {

    @Override
    public int[] sort(int[] originNum) {
        if (null == originNum || originNum.length == 0) {
            return originNum;
        }

        int n = originNum.length;
        int[] arr = Arrays.copyOf(originNum, n);

        quickSort(arr, 0, n - 1);
        return arr;
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = partition(arr, start, end);

        quickSort(arr, start, mid - 1);

        // 注意这里是右半边区间，所以要+1
        quickSort(arr, mid + 1, end);
    }

    /**
     * 分治并且返回中间索引
     * 
     * @param arr
     * @param start
     * @param end
     * @return
     */
    private int partition(int[] arr, int start, int end) {
        int provit = arr[start];

        while (start < end) {
            while (start < end && arr[end] >= provit) {
                end--;
            }

            arr[start] = arr[end];

            while (start < end && arr[start] <= provit) {
                start++;
            }

            arr[end] = arr[start];
        }

        arr[start] = provit;

        return start;
    }
}
