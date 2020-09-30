/***
 * 
 * 
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/537/
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        return hasPathSumHelper(root, sum);
    }

    private boolean hasPathSumHelper(TreeNode root, int sum) {
        if (root.left == null && root.right == null && sum == root.val)
            return true;
        if (root.left == null && root.right == null && sum != root.val)
            return false;
        boolean left = false, right = false;
        if (root.left != null) {
            left = hasPathSumHelper(root.left, sum - root.val);

        }
        if (root.right != null) {
            right = hasPathSumHelper(root.right, sum - root.val);
        }
        return right || left;
    }
}
