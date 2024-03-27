/*
 * @Descripttion: [字母异位词分组](https://leetcode.cn/problems/group-anagrams/description/)
 * @Author: ansuote
 * @Date: 2024-03-22 14:12:59
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-22 15:31:49
 */
package hash;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;;

public class Class49 {
    /**
     * @param strs 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
     * @return 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        // 遍历
        for (String item : strs) {
            // 用26长度的数组，保存出现字母的次数
            int[] counts = new int[26];
            for (int i = 0; i < item.length(); i++) {
                int key = item.charAt(i) - 'a';
                counts[key]++;
            }

            // 遍历26长度的数组，按照顺序输出形式：英文单词 次数的。如：k2a1，这样的key作为分组标志
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0) {
                    buffer.append(i + 'a');
                    buffer.append(counts[i]);
                }
            }

            String mapKey = buffer.toString();

            List<String> list = map.getOrDefault(mapKey, new ArrayList<>());
            list.add(item);

            map.put(mapKey, list);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
