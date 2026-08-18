class Solution {
    public int largestInteger(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i < nums.length; i++){
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        int[] freq = new int[max+1];
        int st = 0;
        int end = k-1;
        while(st <= end && end < nums.length) {
            boolean[] seen = new boolean[max+1];
            for(int i = st; i<= end ; i++){
                if(!seen[nums[i]]) {
                    freq[nums[i]]++;
                    seen[nums[i]] = true;
                }
                
            }
            st++;
            end++;
        }
        int result = -1;
        for(int i = 0 ; i < freq.length; i++) {
            if(freq[i] == 1) {
                if(i > result) {
                    result = i;
                }
            }
        }
        return result;
    }
}