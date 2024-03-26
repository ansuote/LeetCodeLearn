/*
 * @Descripttion: [二叉树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/)
 * @Author: ansuote
 * @Date: 2024-03-26 20:19:31
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-26 20:27:01
 */
package binaryTree;

import base.TreeNode;

public class Class236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root) {
            return null;
        }

        TreeNode node = root;

        if (node == p) {
            return p;
        }

        if (node == q) {
            return q;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);

        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (null == left && null == right) {
            return null;
        } else if (null == left) {
            return right;
        } else if (null == right) {
            return left;
        } else {
            // 如果找到left，又找到right，则就是最近的公共祖先（同时深度最大，离根节点最远）
            return root;
        }
    }
}
