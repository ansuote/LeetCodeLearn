/*
 * @Descripttion: 移动零
 * 
 * @Author: ansuote
 * 
 * @Date: 2024-03-06 13:31:11
 * 
 * @LastEditors: ansuote
 * 
 * @LastEditTime: 2024-03-21 17:07:50
 */

package array;

public class Class283 {

    public void moveZeroes(int[] nums) {
        if (null == nums || nums.length == 0) {
            return;
        }
        int tagetNum = 0;
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != tagetNum) {
                nums[slow] = nums[i];
                slow++;
            }
        }

        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}