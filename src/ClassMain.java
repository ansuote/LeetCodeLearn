/*
 * @Descripttion: 
 * @Author: ansuote
 * @Date: 2024-02-21 18:25:05
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 12:49:22
 */

import sort.BubbleSort;
import sort.InsertSort;
import sort.SelectionSort;
import utils.SortUtils;

public class ClassMain {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 24, 5, 3 };
        // SortUtils.sort(nums, BubbleSort.class);
        // SortUtils.sort(nums, InsertSort.class);
        SortUtils.sort(nums, SelectionSort.class);
    }
}
