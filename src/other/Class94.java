package other;
import java.util.ArrayList;
import java.util.List;

public class Class94 {
    private List<Integer> result = new ArrayList<>();

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