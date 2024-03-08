/*
 * @Descripttion: 
 * @Author: ansuote
 * @Date: 2024-03-08 10:54:34
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-08 11:25:21
 */
package utils;

import sort.ISort;

public class SortUtils {

    public static <T extends ISort> void sort(int[] originNum, Class<T> classObj) {
        ISort sort;
        try {
            sort = classObj.newInstance();
            String className = sort.getClass().getSimpleName();
            System.out.printf(className + "-- 执行排序前");
            StringUtils.println(originNum);

            int[] resultNum = sort.sort(originNum);
            System.out.printf(className + "-- 执行排序后");
            StringUtils.println(resultNum);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
