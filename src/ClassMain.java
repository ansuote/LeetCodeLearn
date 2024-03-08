/*
 * @Descripttion: 
 * @Author: ansuote
 * @Date: 2024-02-21 18:25:05
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 19:14:37
 */

import sort.n.CountSort;
import sort.n2.BubbleSort;
import sort.n2.InsertSort;
import sort.n2.SelectionSort;
import sort.nlogn.QuickSort;
import utils.SortUtils;

public class ClassMain {
    public static void main(String[] args) {
        int[] nums = new int[] { 95, 94, 91, 98, 99, 90, 99, 93, 91, 92 };
        SortUtils.sort(nums, CountSort.class);

        // int[] nums = new int[] { 1, 24, 5, 3, 23, 41, 2, 1, 8, 3, 0 };
        // SortUtils.sort(nums, BubbleSort.class);
        // SortUtils.sort(nums, InsertSort.class);
        // SortUtils.sort(nums, SelectionSort.class);
        // SortUtils.sort(nums, QuickSort.class);
    }
}
