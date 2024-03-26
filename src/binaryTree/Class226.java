/*
 * @Descripttion: [翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/)
 * @Author: ansuote
 * @Date: 2024-03-26 14:37:44
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-26 14:40:02
 */
package binaryTree;

import base.TreeNode;

public class Class226 {
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }

        // 叶子结点
        if (null == root.left && null == root.right) {
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // 左右翻转
        root.left = right;
        root.right = left;

        return root;
    }
}
