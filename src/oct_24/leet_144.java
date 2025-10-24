package oct_24;

import java.util.*;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class leet_144 {

    // ✅ Preorder Traversal (Root -> Left -> Right)
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        result.add(node.val);           // Visit root
        preorder(node.left, result);    // Visit left
        preorder(node.right, result);   // Visit right
    }

    // 💡 Main method for quick testing
    public static void main(String[] args) {
        /*
                1
                 \
                  2
                 /
                3
         */
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        leet_144 solution = new leet_144();
        List<Integer> output = solution.preorderTraversal(root);

        System.out.println("Preorder Traversal Output: " + output);
    }
}
