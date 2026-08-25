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
    List<Integer> res = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        
        if(root == null) {
            return 0;
        }
        minDiffInBST(root.left);
        res.add(root.val);
        minDiffInBST(root.right);
        
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for(int i = 0 ; i < res.size()-1; i++) {
            diff = res.get(i+1) - res.get(i);
            if(diff < min){
                min = diff;
            }
        }
        return min;
    }
}