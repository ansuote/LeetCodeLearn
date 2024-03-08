/*
 * @Descripttion: 
 * @Author: ansuote
 * @Date: 2024-02-21 18:25:05
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 11:22:27
 */

import sort.BubbleSort;
import sort.InsertSort;
import utils.SortUtils;

public class ClassMain {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 24, 5, 3 };
        // SortUtils.sort(nums, BubbleSort.class);
        SortUtils.sort(nums, InsertSort.class);

    }
}
