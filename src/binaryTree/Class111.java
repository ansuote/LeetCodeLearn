/*
 * @Descripttion: [二叉树的最小深度](https://leetcode.cn/problems/minimum-depth-of-binary-tree/description/)
 * @Author: ansuote
 * @Date: 2024-03-26 18:55:33
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-26 19:32:05
 */
package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

import base.TreeNode;

public class Class111 {
    public int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        int depth = 0;

        while (!queue.isEmpty()) {

            depth++;

            int levelSize = queue.size();

            // 这里不能使用 i < queue.size()，因为队列的长度会在for里面变化
            for (int i = 0; i < levelSize; i++) {
                TreeNode treeNode = queue.poll();

                TreeNode left = treeNode.left;
                if (null != left) {
                    queue.add(left);
                }
                TreeNode right = treeNode.right;
                if (null != right) {
                    queue.add(right);
                }

                if (null == left && null == right) {
                    return depth;
                }
            }

        }

        return depth;
    }
}
