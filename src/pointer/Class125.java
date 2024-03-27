/*
 * @Descripttion: [验证回文串](https://leetcode.cn/problems/valid-palindrome/)
 * @Author: ansuote
 * @Date: 2024-03-22 19:22:52
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 10:24:15
 */
package pointer;

public class Class125 {
    public boolean isPalindrome(String s) {
        if (null == s) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // 直到找到下一个字母或数字，所以要用while
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }

                left++;
                right--;
            }

        }

        return true;
    }
}
