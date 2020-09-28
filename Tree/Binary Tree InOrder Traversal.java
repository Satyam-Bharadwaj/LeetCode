/**
 * 
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/929/
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        inorderTraversalOrder(root, order);
        return order;
    }

    private void inorderTraversalOrder(TreeNode root, List<Integer> order) {
        if (root == null)
            return;
        inorderTraversalOrder(root.left, order);
        order.add(root.val);
        inorderTraversalOrder(root.right, order);
    }
}
