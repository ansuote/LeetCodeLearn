/*
 * @Descripttion: 
 * @Author: ansuote
 * @Date: 2024-03-07 19:19:01
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-07 19:23:53
 */
package utils;

public class StringUtils {
    public static void println(int[] nums) {
        if (null == nums) {
            System.out.println("nums is null");
            return;
        }

        if (nums.length == 0) {
            System.out.println("num's length is 0");
            return;
        }

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("num is [");

        for (int i = 0; i < nums.length; i++) {
            stringBuffer.append(nums[i]);
            if (i < nums.length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");

        System.out.println(stringBuffer.toString());

    }
}
