/*
 * @Descripttion: [删除排序链表中的重复元素 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/)
 * @Author: ansuote
 * @Date: 2024-03-13 19:30:10
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 10:24:49
 */
package recursive;

import base.ListNode;

public class Class82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }

        if (head.val != head.next.val) {
            ListNode node = deleteDuplicates(head.next);
            head.next = node;
            return head;
        } else {
            ListNode newListNode = head.next;
            while (null != newListNode && newListNode.val == head.val) {
                newListNode = newListNode.next;
            }

            return deleteDuplicates(newListNode);
        }
    }
}
