/*
 * @Descripttion: [无重复字符的最长子串。（其中不含有重复字符的 最长子串 的长度）](https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/)
 * @Author: ansuote
 * @Date: 2024-03-15 17:00:22
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 10:18:09
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
