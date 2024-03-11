/*
 * @Descripttion: 链表的中间节点
 * @Author: ansuote
 * @Date: 2024-03-11 10:01:23
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-11 10:07:49
 */
package other.linkedList;

import base.ListNode;

public class Class876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
