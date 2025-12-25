package dec_25;

import java.util.*;
//
public class leet_105 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode root = buildTree(preorder, inorder);
        System.out.println("Inorder traversal of constructed tree:");
        printInorder(root); // Expected output: 9 3 15 20 7
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Deque<Integer> preorderQueue = new ArrayDeque<>();
        for (int val : preorder) {
            preorderQueue.offer(val);
        }
        return build(preorderQueue, inorder);
    }

    private static TreeNode build(Deque<Integer> preorder, int[] inorder) {
        if (inorder.length > 0) {
            int idx = indexOf(inorder, preorder.poll());
            TreeNode root = new TreeNode(inorder[idx]);

            root.left = build(preorder, Arrays.copyOfRange(inorder, 0, idx));
            root.right = build(preorder, Arrays.copyOfRange(inorder, idx + 1, inorder.length));

            return root;
        }
        return null;
    }

    private static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1; // shouldn't happen with valid input
    }

    private static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}