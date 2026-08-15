class Solution {
    public String removeOuterParentheses(String s) {
        List<Character> res = new ArrayList<>();
        int c = 0;
        for(int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                c++;
                if(c >= 2) {
                    res.add(s.charAt(i));
                }else{
                    continue;
                }
            }
            if(s.charAt(i) == ')') {
                c--;
                if(c >= 1) {
                    res.add(s.charAt(i));
                }else{
                    continue;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch : res) {
            sb.append(ch);
        }

        return sb.toString();
    }
}