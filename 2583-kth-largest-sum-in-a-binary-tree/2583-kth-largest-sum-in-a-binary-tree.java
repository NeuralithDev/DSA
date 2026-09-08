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
    public List<Long> maxSumK = new ArrayList<>();
    public void levelOrder(TreeNode root){
        long sum = 0;
        
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
          
            TreeNode currNode = q.remove();
            if(currNode == null){
                maxSumK.add(sum);
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    sum = 0;
                }
            }else{
                sum += currNode.val;
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
            
        }
        
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        levelOrder(root);
        Collections.sort(maxSumK);
        if(k > maxSumK.size()) return -1;
        return maxSumK.get(maxSumK.size()-k);
    }
}