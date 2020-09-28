/**
 * 
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/931/
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */

 // Level maintenace is important as we wont know which level list to append a given node's value to without it.
 // Level can be avoide if we make sure to iterate over size of the queue at the begining of the while loop.

class Solution {
    class Vertex {
        TreeNode node;
        int level;

        public Vertex(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        if (root == null)
            return levelOrder;

        Queue<Vertex> pending = new LinkedList<>();
        pending.add(new Vertex(root, 0));



        while (!pending.isEmpty()) {
            Vertex v = pending.remove();
            if (v.level < levelOrder.size()) {
                levelOrder.get(v.level).add(v.node.val);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(v.node.val);
                levelOrder.add(v.level, temp);
            }
            if (v.node.left != null) {
                pending.add(new Vertex(v.node.left, v.level + 1));
            }
            if (v.node.right != null) {
                pending.add(new Vertex(v.node.right, v.level + 1));
            }

        }
        return levelOrder;


    }
}
