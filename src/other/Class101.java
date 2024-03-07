package other;
/*
 * @Descripttion: 
 * @Author: ansuote
 * @Date: 2024-02-21 18:29:08
 * @LastEditors: ansuote
 * @LastEditTime: 2024-03-07 19:37:45
 */

// import java.util.ArrayDeque;
// import java.util.Deque;

public class Class101 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

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
