/*
 * @Descripttion: 反转链表
 * @Author: ansuote
 * @Date: 2024-03-11 11:09:56
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-11 11:12:21
 */
package other.linkedList;

import base.ListNode;

public class Class206 {
    public ListNode reverseList(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }

        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
