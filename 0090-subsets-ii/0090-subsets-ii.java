class Solution {
    HashSet<List<Integer>> mid = new HashSet<>();
    public void subsets(int[] nums, List<Integer> ans, int i) {
        //base case
        if(i == nums.length) {
            mid.add(new ArrayList<>(ans));
            return;
        }
        //recursion
        int curr = nums[i];
        ans.add(curr);
        subsets(nums,ans,i+1);
        //backtrack
        ans.remove(ans.size()-1);
        
        subsets(nums,ans,i+1);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        subsets(nums,ans,0);
        List<List<Integer>> fin = new ArrayList<>(mid);
        return fin;
        
    }
}