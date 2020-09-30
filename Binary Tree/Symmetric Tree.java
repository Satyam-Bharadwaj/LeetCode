/**
 * 
 * https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/536/
 */


/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricU(root, root);
    }

    private boolean isSymmetricU(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        return (root1.val == root2.val) && isSymmetricU(root1.left, root2.right)
                && isSymmetricU(root1.right, root2.left);


    }
}
