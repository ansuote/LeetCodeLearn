/*
 * @Descripttion: 合并两个有序链表
 * @Author: ansuote
 * @Date: 2024-03-11 10:30:39
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-11 10:54:54
 */
package other.linkedList;

import base.ListNode;

public class Class21 {

    /**
     * 方法2: 虚拟头节点方式
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        // 虚拟头节点
        ListNode dummy = new ListNode(-1);

        ListNode pre = dummy;

        while (null != l1 && null != l2) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
            // 让 pre 向后移动
            pre = pre.next;
        }

        if (null != l1) {
            pre.next = l1;
        }

        if (null != l2) {
            pre.next = l2;
        }

        // 最后返回虚拟节点的 next 指针
        return dummy.next;
    }

    /**
     * 方法1: 递归方式
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (null == list1) {
            return list2;
        }

        if (null == list2) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
