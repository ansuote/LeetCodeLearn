/*
 * @Descripttion: 归并排序
 * @Author: ansuote
 * @Date: 2024-03-08 13:50:19
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 14:52:48
 */
package sort.nlogn;

import sort.ISort;

public class MergeSort implements ISort {

    @Override
    public int[] sort(int[] originNum) {
        if (null == originNum || originNum.length == 0) {
            return originNum;
        }

        int n = originNum.length;

        int[] result = new int[n];

        mergeSort(originNum, result, 0, n - 1);
        return result;
    }

    /**
     * 递归
     * 
     * @param arr
     * @param result
     * @param start
     * @param end
     */
    private void mergeSort(int[] arr, int[] result, int start, int end) {
        while (start >= end) {
            return;
        }

        int start1 = start;
        int mid = (start + end) / 2;
        int end1 = mid;

        int start2 = mid + 1;
        int end2 = end;

        mergeSort(arr, result, start1, end1);
        mergeSort(arr, result, start2, end2);

        int k = start;

        while (start1 <= end1 && start2 <= end2) {
            if (arr[start1] < arr[start2]) {
                result[k] = arr[start1];
                start1++;
                k++;
            } else {
                result[k] = arr[start2];
                start2++;
                k++;
            }
        }

        while (start1 <= end1) {
            arr[k] = arr[start1];
            k++;
            start1++;
        }

        while (start2 <= end2) {
            arr[k] = arr[start2];
            k++;
            start2++;
        }
    }

}
