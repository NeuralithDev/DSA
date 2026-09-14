class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void findSubsets(int[] nums, ArrayList<Integer> ans, int i){
        //base case
        if(i == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        //recursive call
        ans.add(nums[i]);
        findSubsets(nums,ans,i+1);
        ans.remove(ans.size()-1);
        findSubsets(nums,ans,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        findSubsets(nums,ans,0);
        return res;
    }
}