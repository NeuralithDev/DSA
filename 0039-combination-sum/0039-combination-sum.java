class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public void findCombination(int[] candidates,List<Integer> ans,int i,int target) {
        //base cases
        if(i == candidates.length){
            if(target == 0) {
                res.add(new ArrayList<>(ans));
                return;
            }else{
                return;
            }
            
        }
        if(target < 0) {
            return;
        }
        
        //recursion
        ans.add(candidates[i]);
        findCombination(candidates, ans, i, target-candidates[i]);
        ans.remove(ans.size()-1);
        findCombination(candidates, ans, i+1, target);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        findCombination(candidates,ans,0,target);
        return res;
    }
}