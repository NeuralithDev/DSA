/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean getPath(TreeNode root, int n,ArrayList<TreeNode> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.val == n){
            return true;
        }

        boolean fl = getPath(root.left, n, path);
        boolean fr = getPath(root.right, n, path);
        if(fl || fr){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> p1 = new ArrayList<>();
        ArrayList<TreeNode> q1 = new ArrayList<>();
        
        getPath(root,p.val,p1);
        getPath(root,q.val,q1);

        int i = 0;
        while(i < p1.size() && i < q1.size()){
            if(p1.get(i) != q1.get(i)){
                break;
            }
            i++;
        }
        TreeNode lca = p1.get(i-1);
        return lca;
    }
}