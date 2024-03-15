/*
 * @Descripttion: 无重复字符的最长子串
 * @Author: ansuote
 * @Date: 2024-03-15 17:00:22
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-15 17:14:25
 */
package deque;

import java.util.HashSet;

public class Class3 {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int result = 0;

        for (int end = 0; end < s.length(); end++) {
            Character item = s.charAt(end);

            while (set.contains(item)) {

                // 逐步缩短左边
                set.remove(s.charAt(start));
                start++;
            }

            set.add(item);

            result = Math.max(result, end - start + 1);
        }

        return result;

    }
}
