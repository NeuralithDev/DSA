class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            
            temp/=10;
        }
        int tot = sum + prod;
        if(n % tot != 0){
            return false;
        }
        return true;
    }
}