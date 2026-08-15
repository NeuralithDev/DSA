class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for(int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                c++;
                if(c >= 2) {
                    sb.append(s.charAt(i));
                }
            }
            if(s.charAt(i) == ')') {
                c--;
                if(c >= 1) {
                    sb.append(s.charAt(i));
                }
            }
        }
        
        

        return sb.toString();
    }
}