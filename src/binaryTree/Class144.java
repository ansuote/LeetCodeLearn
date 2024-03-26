/*
 * @Descripttion: [二叉树前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/)
 * @Author: ansuote
 * @Date: 2024-03-26 10:13:04
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-26 13:39:41
 */
package binaryTree;

import java.util.ArrayList;
import java.util.List;

import base.TreeNode;

import java.util.Stack;

public class Class144 {

    /**
     * 方法1: 前序遍历 - 递归版本
     * 
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    /**
     * 深度遍历
     * 
     * @param node
     * @param list
     */
    private void dfs(TreeNode node, List<Integer> list) {
        if (null == node) {
            return;
        }

        // list.add 放在此处为 前序遍历
        list.add(node.val);
        dfs(node.left, list);
        // list.add 放在此处为 中序遍历
        dfs(node.right, list);
        // list.add 放在此处为 后序遍历
    }

    // -------------------------------------------------------------

    /**
     * 方法2: 前序遍历 - 迭代算法版本
     * 
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>(); // 存储结果

        TreeNode node = root;

        int nodeLeft = 100; // 开始遍历左边
        int noedRight = 200; // 开始遍历右边
        int nodeUp = 300; // 左边或者右边遍历完了，退回到上一个节点

        int currentState = nodeLeft; // 当前状态

        Stack<TreeNode> stack = new Stack<>(); // 栈用于保存父节点

        while (null != node) {
            if (currentState == nodeLeft) {
                // 前序遍历
                list.add(node.val);
                if (null != node.left) {
                    stack.push(node);
                    node = node.left;
                } else {
                    currentState = noedRight;
                }
            } else if (currentState == noedRight) {
                // 中序遍历
                // list.add(node.val);

                if (null != node.right) {
                    stack.push(node);
                    node = node.right;
                    currentState = nodeLeft;
                } else {
                    currentState = nodeUp;
                }
            } else if (currentState == nodeUp) {
                TreeNode parentNode = null;
                // 后序遍历
                // list.add(node.val);
                if (!stack.isEmpty()) {
                    parentNode = stack.pop();

                    // 如果是从左边过来的，那么就要查右边
                    if (parentNode.left == node) {
                        currentState = noedRight;
                    }

                }
                // 最后都需要重新赋值，才能结束循环
                node = parentNode;
            }

        }

        return list;
    }
}
