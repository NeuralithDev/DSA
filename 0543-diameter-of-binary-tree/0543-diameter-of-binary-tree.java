/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    static class Info {
        int ht;
        int diam;

        Info(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).diam;
    }

    private Info diameter(TreeNode root) {

        if(root == null) {
            return new Info(0, 0);
        }

        Info left = diameter(root.left);
        Info right = diameter(root.right);

        int ht = Math.max(left.ht, right.ht) + 1;

        int diam = Math.max(
            Math.max(left.diam, right.diam),
            left.ht + right.ht
        );

        return new Info(ht, diam);
    }
}