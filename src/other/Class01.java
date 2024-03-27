package other;

/*
 * @Descripttion: [两数之和](https://leetcode.cn/problems/two-sum/)
 * @Author: ansuote
 * @Date: 2024-01-26 20:17:34
 * @LastEditors: ansuote
 * @LastEditTime: 2024-02-13 18:03:07
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Class01 -- 两数之和Class
 */
public class Class01 {

    public static void main(String[] args) {
        int[] originData = { 100, 10, 20, 201, 0, 281 };

        int[] result = twoSum(originData, 300);

        if (null == result || null != result && result.length == 2 && result[0] == 0 && result[1] == 0) {
            System.out.println("没有找到 " + Arrays.toString(result));
        } else {
            System.out.println("找到了 " + Arrays.toString(result));
        }

    }

    public static int[] twoSumOld(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <= nums.length - 1; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[] { map.get(result), i };
            }
            map.put(nums[i], i);
        }

        return null;
    }
}