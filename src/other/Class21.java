package other;

import base.ListNode;

/*
 * @Descripttion: 合并两个有序列表
 * @Author: ansuote
 * @Date: 2024-02-15 20:25:04
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-11 10:10:30
 */
public class Class21 {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(3));
        ListNode list2 = new ListNode(2, new ListNode(4));

        ListNode result = mergeTwoLists(list1, list2);
        printListNode(result);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

    public static void printListNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

}
