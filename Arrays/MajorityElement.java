package Arrays;
public class MajorityElement {
    public int majority(int[] nums) {
        int n = nums.length;
        int freq = 0;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            if(freq == 0) {
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            }else{
                freq--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();
        
        // Setup a test case
        int[] testArray = {2, 2, 1, 1, 1, 2, 2};
        
        // Execute and print
        int result = solution.majority(testArray);
        System.out.println("The Majority Element is: " + result);
    }
}