/*
 * @Descripttion: [最大二叉树](https://leetcode-cn.com/problems/maximum-binary-tree)
 * @Author: ansuote
 * @Date: 2024-03-26 14:45:16
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-26 16:54:12
 */
package binaryTree;

import base.TreeNode;

public class Class654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return traversal(nums, 0, nums.length - 1);
    }

    private TreeNode traversal(int[] nums, int left, int right) {
        if (null == nums || nums.length == 0) {
            return null;
        }

        if (left > right) {
            return null;
        }

        // 仅有一个节点
        if (left == right) {
            return new TreeNode(nums[left]);
        }

        // 找到区间内最大数
        int maxIndex = left;
        // 这里的right是数组最后一个索引，所以要 <=
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        TreeNode node = new TreeNode(nums[maxIndex]);

        TreeNode leftNode = traversal(nums, left, maxIndex - 1);
        TreeNode rightNode = traversal(nums, maxIndex + 1, right);

        node.left = leftNode;
        node.right = rightNode;

        return node;
    }
}
