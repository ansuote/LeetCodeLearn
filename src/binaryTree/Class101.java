package binaryTree;
/*
 * @Descripttion: 对称二叉树
 * @Link: https://leetcode.cn/problems/symmetric-tree/description/
 * @Author: ansuote
 * @Date: 2024-02-21 18:29:08
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 09:37:46
 */

import base.TreeNode;

// import java.util.ArrayDeque;
// import java.util.Deque;

public class Class101 {

    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return false;
        }
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode leftNode, TreeNode rigNode) {
        if (null == leftNode && null == rigNode) {
            return true;
        }

        if (null == leftNode || null == rigNode || leftNode.val != rigNode.val) {
            return false;
        }

        return dfs(leftNode.left, rigNode.right) && dfs(leftNode.right, rigNode.left);
    }

}
