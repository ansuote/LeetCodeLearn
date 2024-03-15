/*
 * @Descripttion: 滑动窗口最大值
 * @Author: ansuote
 * @Date: 2024-03-15 15:56:00
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-15 16:58:51
 */

package deque;

import java.util.Deque;
import java.util.LinkedList;

public class Class239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (null == nums || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        // 双端队列-用于单调递减队列
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }

            deque.addLast(nums[i]);
        }

        result[0] = deque.peekFirst();

        // 开始滑动
        for (int i = k; i < nums.length; i++) {

            if (!deque.isEmpty() && nums[i - k] == deque.peekFirst()) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }

            deque.addLast(nums[i]);

            result[i - k + 1] = deque.peekFirst();
        }

        return result;
    }
}