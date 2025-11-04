package nov_4;

class TreeNode108 {
    int val;
    TreeNode108 left;
    TreeNode108 right;
    TreeNode108(int x) { val = x; }
}

public class leet_108 {
    public TreeNode108 sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode108 build(int[] a, int l, int r) {
        if (l > r) return null;
        int m = (l + r) / 2;
        TreeNode108 root = new TreeNode108(a[m]);
        root.left = build(a, l, m - 1);
        root.right = build(a, m + 1, r);
        return root;
    }

    public static void main(String[] args) {
        leet_108 obj = new leet_108();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode108 root = obj.sortedArrayToBST(nums);
        printInorder(root);
    }

    private static void printInorder(TreeNode108 root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}
