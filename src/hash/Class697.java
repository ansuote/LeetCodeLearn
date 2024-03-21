/*
 * @Descripttion: 数组的度
 * @Author: ansuote
 * @Date: 2024-03-21 20:06:26
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-21 20:23:08
 */
package hash;

import java.util.HashMap;
import java.util.Map;

public class Class697 {
    public int findShortestSubArray(int[] nums) {

        // 遍历数组，获取hashmap（[0]出现次数, [1]第一次出现的索引，[2]第二次出现的索引）
        HashMap<Integer, int[]> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                int[] value = hashMap.get(nums[i]);
                value[0]++;
                value[2] = i;
            } else {
                int[] value = new int[] { 1, i, i };
                hashMap.put(nums[i], value);
            }
        }

        int maxLength = 0;
        int minLenght = 0;
        // 遍历map，获取度的最小数组长度
        for (Map.Entry<Integer, int[]> entry : hashMap.entrySet()) {
            int[] value = entry.getValue();
            int tempLength = value[2] - value[1] + 1;
            if (value[0] > maxLength) {
                maxLength = value[0];
                minLenght = tempLength;
            } else if (value[0] == maxLength) {
                if (minLenght > tempLength) {
                    minLenght = tempLength;
                }
            }
        }

        return minLenght;
    }
}
