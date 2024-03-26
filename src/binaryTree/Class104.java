/*
 * @Descripttion: [二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/)
 * @Author: ansuote
 * @Date: 2024-03-26 19:55:54
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-26 19:57:58
 */
package binaryTree;

import base.TreeNode;

public class Class104 {
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int childDepth = Math.max(left, right);

        return childDepth + 1;
    }
}
