class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int n = nums1.length;
        boolean[] nums = new boolean[n];
        int o = 0;
        int e = 0;
        for(int i = 0 ; i < n ; i++) {
            if(nums1[i] % 2 == 0) {
                e++;
            }else{
                o++;
            }
        }
        if(e == n || o == n) {
            return true;
        }
        if(nums1[0] % 2 == 0) {
            if((nums1[0] - nums1[1]) >= 1) {
                nums[0] = true;
            }else{
                nums[0] = false;
            }
        }else{
            nums[0] = true;
        } 
        for(int i = 1 ; i < n ; i++) {
            if(nums1[i]%2 != 0) {
                nums[i] = true;
            }else{
                if((nums1[i] - nums1[i-1]) >= 1) {
                    nums[i] = true;
                }else{
                    nums[i] = false;
                }
            }
        }
        for(int i = 0 ; i < n; i++) {
            if(nums[i] == false) {
                return false;
            }
        }
        return true;
    }
}