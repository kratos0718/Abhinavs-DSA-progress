package oct_23;

import java.util.*;

public class leet_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, new StringBuilder(), res);
        return res;
    }

    private void dfs(TreeNode node, StringBuilder path, List<String> res) {
        int len = path.length();
        if (len != 0) path.append("->");
        path.append(node.val);

        if (node.left == null && node.right == null) {
            res.add(path.toString());
        } else {
            if (node.left != null) dfs(node.left, path, res);
            if (node.right != null) dfs(node.right, path, res);
        }

        path.setLength(len);
    }

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        leet_257 obj = new leet_257();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> paths = obj.binaryTreePaths(root);
        System.out.println("Binary Tree Paths: " + paths);
        // Output: [1->2->5, 1->3]
    }
}
