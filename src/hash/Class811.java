/*
 * @Descripttion: 子域名访问次数
 * @Author: ansuote
 * @Date: 2024-03-22 10:49:31
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-22 13:52:45
 */
package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class811 {
    /**
     * 
     * @param cpdomains 计数匹配域名数组，如： ["900 google.mail.com", "50 yahoo.com", "1
     *                  intel.mail.com", "5 wiki.org"]
     * @return 数组，如：["901 mail.com","50 yahoo.com","900 google.mail.com","5
     *         wiki.org","5 org","1 intel.mail.com","951 com"]
     */
    public List<String> subdomainVisits(String[] cpdomains) {

        ArrayList<String> resuList = new ArrayList<>();

        if (null == cpdomains || cpdomains.length == 0) {
            return resuList;
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            int idx = 0;
            // 获取数量
            while (idx < cpdomains[i].length() && cpdomains[i].charAt(idx) != ' ') {
                idx++;
            }

            // ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]

            int countValue = Integer.parseInt(cpdomains[i].substring(0, idx));
            int n = cpdomains[i].length();
            int end = n - 1;
            int start = idx + 1;

            // 通过map，统计数据
            while (end >= start) {
                while (end >= start && cpdomains[i].charAt(end) != '.') {
                    end--;
                }

                // 获取子域名
                String keyValue = cpdomains[i].substring(end + 1, n);

                map.put(keyValue, map.getOrDefault(keyValue, 0) + countValue);

                end--;
            }

        }

        // 遍历map，输出数组
        for (String key : map.keySet()) {
            StringBuffer buffer = new StringBuffer();
            buffer.append(map.get(key));
            buffer.append(" ");
            buffer.append(key);
            resuList.add(buffer.toString());
        }
        return resuList;
    }
}
