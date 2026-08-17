class Solution {
    public void moveZeroes(int[] nums) {
        // int c = 0;
        // for(int i = 0 ;i<nums.length; i++) {
        //     if(nums[i] == 0){
        //         c++;
        //     }
        // }
        // int iter = 0;
        // while(iter < c){
        //     int ptr = 0;
        //     for(int i = 0 ; i < nums.length-1; i++) {
        //         if(nums.length > 1){
        //             ptr = i+1;
        //         }
        //         if(nums[i] == 0 && nums[ptr] != 0){
        //             int temp = nums[i];
        //             nums[i] = nums[ptr];
        //             nums[ptr] = temp;
        //             ptr++;
        //         }
        //     }
        //     iter++;
        // }
        int j = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        

    }
}