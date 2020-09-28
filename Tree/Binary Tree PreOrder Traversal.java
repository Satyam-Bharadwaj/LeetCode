/**
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/928/
 * 
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderAddToList(root, result);
        return result;

    }

    private void preorderAddToList(TreeNode root, List<Integer> order) {
        if (root == null)
            return;
        order.add(root.val);
        preorderAddToList(root.left, order);

        preorderAddToList(root.right, order);
    }
}
