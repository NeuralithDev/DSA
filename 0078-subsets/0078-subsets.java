class Solution {
    public List<List<Integer>> fin = new ArrayList<>();
    public void findSubsets(int[] nums, List<Integer> ans, int idx){
        //base case
        if(idx == nums.length){
            fin.add(new ArrayList<>(ans));
            return;
        }
        //recursion
        //Yes
        ans.add(nums[idx]);
        findSubsets(nums,ans,idx+1);
        //BackTrack
        ans.remove(ans.size()-1);
        //No
        findSubsets(nums, ans, idx+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(nums,new ArrayList<>(), 0);
        return fin;
    }
}