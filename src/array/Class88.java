/*
 * @Descripttion: 合并两个有序数组
 * @Author: ansuote
 * @Date: 2024-03-06 16:29:11
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-06 16:47:27
 */
package array;

public class Class88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;

        int i = m - 1;
        int j = n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                i--;
                index--;
            } else {
                nums1[index] = nums2[j];
                j--;
                index--;
            }
        }
    }
}
