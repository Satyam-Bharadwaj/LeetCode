/**
 * 
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/930/
 */


/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        postOrderRecursive(root, order);
        return order;
    }

    private void postOrderRecursive(TreeNode root, List<Integer> order) {
        if (root == null)
            return;
        postOrderRecursive(root.left, order);

        postOrderRecursive(root.right, order);
        order.add(root.val);
    }
}
