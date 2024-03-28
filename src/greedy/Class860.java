/*
 * @Descripttion: [柠檬水找零](https://leetcode.cn/problems/lemonade-change/description/)
 * @Author: ansuote
 * @Date: 2024-03-28 14:07:13
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-28 14:13:07
 */
package greedy;

public class Class860 {
    public boolean lemonadeChange(int[] bills) {
        if (null == bills || bills.length == 0) {
            return true;
        }

        // 5元钞票数量
        int five = 0;
        // 10元钞票数量
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {
            int bill = bills[i];

            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }

        }

        // 所有顾客都找到零钱了
        return true;
    }
}
