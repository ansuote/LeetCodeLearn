/*
 * @Descripttion: 二叉树结构
 * @Author: ansuote
 * @Date: 2024-03-26 10:11:12
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-26 10:16:22
 */
package base;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {

    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
