/*
 * @Descripttion: [从前序与中序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/)
 * @Author: ansuote
 * @Date: 2024-03-27 11:16:57
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 11:38:17
 */
package binaryTree;

import base.TreeNode;
import java.util.HashMap;

public class Class105 {
    /**
     * 
     * @param preorder 是二叉树的先序遍历
     * @param inorder  是同一棵树的中序遍历
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (null == preorder || preorder.length == 0 || null == inorder || inorder.length == 0) {
            return null;
        }

        // 根节点。先序遍历的第一个元素
        TreeNode root = new TreeNode(preorder[0]);

        // 遍历中序遍历，加入到hashmap里面
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            // 因为 inorder 无重复元素
            map.put(inorder[i], i);
        }

        // 遍历先序遍历数组，依次加入到二叉树里面
        // 注意[0]，已经有值，此处要从[1]开始
        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = new TreeNode(preorder[i]);
            insertNode(node, root, map);
        }

        return root;
    }

    /**
     * 插入node到二叉树里面
     * 
     * @param node 当前节点(需要插入)
     * @param root 根节点
     * @param map  存储顺序关系的map
     */
    private void insertNode(TreeNode node, TreeNode root, HashMap<Integer, Integer> map) {
        if (null == node || null == root) {
            return;
        }

        while (node != root) {

            if (map.get(node.val) < map.get(root.val)) {
                // 如果当前node在中序遍历的索引是在root的左边，则node在root左子树

                // 如果root之前没有左子树，则作为左子树
                if (null == root.left) {
                    root.left = node;
                }

                // 指针往下一个左子树查找。
                // 1. 如果是之前没有左子树，此时就会退出循环。
                // 2. 如果之前有左子树，则指针挑战到下一个左子树，继续循环
                root = root.left;

            } else {
                // 右子树

                if (null == root.right) {
                    root.right = node;
                }

                root = root.right;
            }

        }
    }
}
