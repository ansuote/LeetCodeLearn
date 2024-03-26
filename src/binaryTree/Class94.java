/*
 * @Descripttion: 二叉树的中序遍历
 * @Author: ansuote
 * @Date: 2024-02-16 20:24:58
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-26 10:21:31
 */
package binaryTree;

import java.util.ArrayList;
import java.util.List;

import base.TreeNode;

public class Class94 {
    private List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode treeNode) {
        if (null == treeNode) {
            return result;
        }
        dfs(treeNode);
        return result;
    }

    public void dfs(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }

        dfs(treeNode.left);
        result.add(treeNode.val);
        dfs(treeNode.right);
    }
}