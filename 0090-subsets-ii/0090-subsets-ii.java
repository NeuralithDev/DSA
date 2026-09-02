class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void subsets(int[] nums, List<Integer> ans, int i) {
        //base case
        if(i == nums.length) {
            res.add(new ArrayList<>(ans));
            return;
        }
        //recursion
        ans.add(nums[i]);
        subsets(nums,ans,i+1);
        ans.remove(ans.size()-1);
        int idx = i+1;
        while(idx < nums.length && nums[idx] == nums[idx-1]) {
            idx++;
        }
        subsets(nums,ans,idx);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        subsets(nums,ans,0);
        return res;
        
    }
}