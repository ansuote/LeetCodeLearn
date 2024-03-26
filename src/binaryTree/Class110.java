/*
 * @Descripttion: [平衡二叉树](https://leetcode-cn.com/problems/balanced-binary-tree)
 * @Author: ansuote
 * @Date: 2024-03-26 17:04:59
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-26 17:29:44
 */
package binaryTree;

import base.TreeNode;

public class Class110 {
    public boolean isBalanced(TreeNode root) {
        return reducr(root) != -1;
    }

    /**
     * 递归调用，返回当前节点树的高度
     * 
     * @param root
     * @return 树的高度。-1 则代表不是平衡二叉树，退出程序。否则返回当前树的高度
     */
    private int reducr(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int leftHeight = reducr(root.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = reducr(root.right);
        if (rightHeight == -1) {
            return -1;
        }

        // 如果节点的左子树和右子树都为平衡二叉树，则比较两者高度差。（对比高度差 等价于 对比 深度差）
        return Math.abs(leftHeight - rightHeight) < 2 ? Math.max(leftHeight, rightHeight) + 1 : -1;
    }
}
