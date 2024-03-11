/*
 * @Descripttion: 
 * @Author: ansuote
 * @Date: 2024-03-11 10:01:56
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-11 10:06:05
 */
package base;

/**
 * 单链表结构
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}