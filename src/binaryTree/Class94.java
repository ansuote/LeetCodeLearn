/*
 * @Descripttion: 二叉树的中序遍历
 * 尝试链接: https://leetcode.cn/problems/binary-tree-inorder-traversal/
 * @Author: ansuote
 * @Date: 2024-02-16 20:24:58
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-27 09:47:25
 * <a href="https://leetcode.cn/problems/binary-tree-inorder-traversal/">示例网站</a>
 */
package binaryTree;

import java.util.ArrayList;
import java.util.List;

import base.TreeNode;

public class Class94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (null == root) {
            return list;
        }
        dfs(root, list);
        return list;
    }

    public void dfs(TreeNode node, List<Integer> list) {
        if (null == node) {
            return;
        }

        dfs(node.left, list);
        list.add(node.val);
        dfs(node.right, list);
    }
}