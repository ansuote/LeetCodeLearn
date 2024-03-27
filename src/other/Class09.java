package other;
/*
 * @Descripttion: [回文数](https://leetcode.cn/problems/palindrome-number/)
 * @Author: ansuote
 * @Date: 2024-02-13 18:03:35
 * @LastEditors: ansuote
 * @LastEditTime: 2024-02-13 21:06:30
 */
public class Class09 {

    public static void main(String[] args) {
        boolean result = isPalindrome(2222);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {

        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }

        int y = 0;
        for (; y < x; x = x / 10) {
            y = y * 10 + x % 10;
        }

        return x == y || y / 10 == x;
    }
}
